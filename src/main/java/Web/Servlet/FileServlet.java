package Web.Servlet;

import domain.LoginUser;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.ProgressListener;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.UUID;


@WebServlet("/pic/*")
public class FileServlet extends BaseServlet {


    public void uploadPic(HttpServletRequest request, HttpServletResponse resp) throws IOException, ServletException {
        //判断是普通表单还是带文件的表单
        if(!ServletFileUpload.isMultipartContent(request))
        {
            return;
        }
        String msg;
        try {
            //上传文件的保存路径
            String UploadPath = this.getServletContext().getRealPath("/WEB-INF/upload");
            File UploadFile = new File(UploadPath);
            if(!UploadFile.exists())
            {
                UploadFile.mkdir();//创建对应目录
            }


            //缓存，临时文件，即文件过大时暂时存储，过几天提醒用户删除
            String TmpPath = this.getServletContext().getRealPath("/WEB-INF/tmp");
            File TmpFile = new File(TmpPath);
            if(!TmpFile.exists())
            {
                TmpFile.mkdir();//创建对应目录
            }



            //处理上传文件路径以及大小限制
            DiskFileItemFactory factory = new DiskFileItemFactory();
            factory.setSizeThreshold(1024*1024);
            factory.setRepository(TmpFile);


            ServletFileUpload upload = new ServletFileUpload(factory);
            //监听文件上传进度
            upload.setProgressListener(new ProgressListener() {
                @Override
                //l已经读取到的文件大小
                //l1文件大小
                public void update(long l, long l1, int i) {
                    System.out.println("Total size："+l1+" finished："+l);
                }
            });
            upload.setHeaderEncoding("UTF-8");
            upload.setFileSizeMax(1024*1024*10);
            upload.setSizeMax(1024*1024*100);

            //处理上传文件

            List<FileItem> fileItems = upload.parseRequest(request);
            for(FileItem fileItem:fileItems)
            {
                if(fileItem.isFormField())
                {
                    String name = fileItem.getFieldName();//getFieldName得到的是前端表单控件的name
                    String value = fileItem.getString("UTF-8");
                    System.out.println(name+":"+value);
                }
                else
                {   //-------------------处理文件------------------------
                    String UploadFilename = fileItem.getName();
                    if(UploadFilename.trim().equals("")||UploadFilename==null) continue;
                    //获得文件名
                    String filename = UploadFilename.substring(UploadFilename.lastIndexOf("/")+1);
                    //获得文件后缀名
                    String fileExtName = UploadFilename.substring(UploadFilename.lastIndexOf(".")+1);
                    System.out.println(filename);
                    String uuidPath = UUID.randomUUID().toString();


                    //-------------------存放地址------------------------
                    String realPath = UploadPath+"/"+uuidPath;
                    File realPathFile = new File(realPath);
                    if(!realPathFile.exists())
                    {
                        realPathFile.mkdir();
                    }



                    //-------------------文件传输------------------------
                    InputStream inputStream = fileItem.getInputStream();
                    FileOutputStream fileOutputStream = new FileOutputStream(realPath+"/"+filename);

                    byte[] buffer = new byte[1024*1024];
                    int len = 0;
                    while((len=inputStream.read(buffer))>0)
                    {
                        fileOutputStream.write(buffer,0,len);
                    }
                    fileOutputStream.close();
                    inputStream.close();
                    fileItem.delete();
                    msg = "upload success";
                    request.setAttribute("msg",msg);
                    request.getRequestDispatcher("/index.jsp").forward(request,resp);
                }
            }




        } catch (FileUploadException e) {
            e.printStackTrace();
        }




    }





}
