package Web.Servlet;

import Service.Impl.UserServiceImpl;
import Service.UserService;
import Util.Md5Util;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import domain.LoginUser;
import domain.ResultInfo;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/User/*")
public class UserServlet extends BaseServlet {


    public void login(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        Map<String,String[]> map = req.getParameterMap();
        LoginUser user = new LoginUser();
        try {
            BeanUtils.populate(user,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        UserService userService = new UserServiceImpl();
        user.setPassword(Md5Util.encodeByMd5(user.getPassword()));
        LoginUser loginUser = userService.Login(user);
        ResultInfo info = new ResultInfo();
        HttpSession session = req.getSession();
        if(loginUser!=null)
        {
            info.setFlag(true);
            session.setAttribute("user",loginUser);
            System.out.println("login success");
        }
        else
        {
            info.setFlag(false);
            info.setErrorMsg("用户名或者密码错误");
            System.out.println("login false");
        }
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(info);
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().write(json);

    }
    public void register(HttpServletRequest req,HttpServletResponse resp) throws Exception {
         Map<String,String []>map =req.getParameterMap();
         LoginUser user = new LoginUser();
         BeanUtils.populate(user,map);
         user.setPassword(Md5Util.encodeByMd5(user.getPassword()));
         UserService userService = new UserServiceImpl();
         boolean flag = userService.register(user);
         ResultInfo info = new ResultInfo();
         if(flag)
         {
             info.setFlag(true);
         }
         else
         {
             info.setFlag(false);
             info.setErrorMsg("注册失败");
         }
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(info);
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().write(json);
        System.out.println("正常结束register");

    }
    public void active(HttpServletRequest req,HttpServletResponse resp) throws IOException {
        System.out.println("active");
        String code = req.getParameter("code");
        String msg = null;
        if(code!=null)
        {
             UserService userService = new UserServiceImpl();
            boolean flag = userService.active(code);
            if (flag) {
                msg = "激活成功,请<a href='http://localhost:8080/srt/'>登录</a>";
            } else {
                msg = "激活失败，请联系管理员";
            }
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().write(msg);
        }

    }
    public void exit(HttpServletRequest req,HttpServletResponse resp) throws IOException {
          req.getSession().invalidate();
          resp.sendRedirect(req.getContextPath()+"/html/Login.html");
    }
}
