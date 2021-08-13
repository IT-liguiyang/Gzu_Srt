package Web.Servlet;

import Service.Impl.ProServiceImpl;
import Service.ProService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import domain.Product;
import domain.QuickPro;
import domain.ResultInfo;
import domain.SeekPro;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@WebServlet("/Pro/*")
public class ProServlet extends BaseServlet {
    ProService proService = new ProServiceImpl();


    public void typeFind(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String type = req.getParameter("type");
        List<Product> list = proService.getByType(type);
        for (Product pro: list) {
            System.out.println(pro);
        }
        ResultInfo info = new ResultInfo();
        HttpSession session = req.getSession();
        info.setFlag(true);
        info.setData(list);
        session.setAttribute("proList",list);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(info);
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().write(json);
    }

    public void paramFind(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String temp = req.getParameter("start");
        int start = Integer.parseInt(temp);
        String type = req.getParameter("pname");
        String category = req.getParameter("leimu");
        String price = req.getParameter("jiage");
        String place = req.getParameter("diqu");
        String typeSupply = req.getParameter("gongyingleixing");
        String mode = req.getParameter("moshi");
        String FindType = req.getParameter("type");

        List<Product> list = proService.getbyParams(start,type,category,price,place,typeSupply,mode,FindType);
        for (Product pro: list) {
            System.out.println(pro);
        }
        List<Object> result = new ArrayList<>() ;
        int totalMount=proService.getWages(start,type,category,price,place,typeSupply,mode,FindType);
        result.add(list);
        result.add(totalMount);

        ResultInfo info = new ResultInfo();
        HttpSession session = req.getSession();
        info.setFlag(true);
        info.setData(result);

        session.setAttribute("proList",list);
        session.setAttribute("totalMount",totalMount);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(info);
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().write(json);
    }

    public void insertSeek(HttpServletRequest req, HttpServletResponse resp) throws InvocationTargetException, IllegalAccessException, IOException {

        String productName = req.getParameter("productName");
        String productType = req.getParameter("productType");
        String amount = req.getParameter("amount");
        float temp = Float.parseFloat(amount);
        String publishDate = req.getParameter("publishDate");
        String productBrand = req.getParameter("productBrand");
        String purchaser = req.getParameter("purchaser");
        String telephone = req.getParameter("telephone");
        String email = req.getParameter("email");
        String price_min = req.getParameter("price_min");
        String price_max = req.getParameter("price_max");
        String description = req.getParameter("description");




        SeekPro seekPro = new SeekPro(productName,productType,temp,productBrand,purchaser,telephone,email,price_min,price_max,description,publishDate);

        proService.insertSeekPro(seekPro);

        ResultInfo info = new ResultInfo();
        HttpSession session = req.getSession();
        info.setFlag(true);


        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(info);
        session.setAttribute("result",info);
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().write(json);
    }

    public void insertQuick(HttpServletRequest req, HttpServletResponse resp) throws InvocationTargetException, IllegalAccessException, IOException {

        String productName = req.getParameter("productName");
        String productType = req.getParameter("productType");
        String productScale = req.getParameter("productScale");
        String productBrand = req.getParameter("productBrand");
        String publishDate = req.getParameter("publishDate");

        String producePlace = req.getParameter("producePlace");
        String telephone = req.getParameter("telephone");
        String email = req.getParameter("email");
        String produceFactory = req.getParameter("produceFactory");
        String soldMerchant = req.getParameter("soldMerchant");
        String price = req.getParameter("price");
        String description = req.getParameter("description");

        QuickPro quickPro = new QuickPro(productName,productType,productScale,productBrand,publishDate,producePlace,telephone,email,produceFactory,soldMerchant,price,description);
        proService.insertQuickPro(quickPro);




        ResultInfo info = new ResultInfo();
        HttpSession session = req.getSession();
        info.setFlag(true);


        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(info);
        session.setAttribute("result",info);
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().write(json);
    }

}
