package Web.Servlet;

import Service.Impl.OrderServiceImpl;
import Service.Impl.PurchaseServiceImpl;
import Service.OrderService;
import Service.PurchaseService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import domain.LoginUser;
import domain.Purchase;
import domain.ResultInfo;


import javax.mail.Session;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet("/Ord/*")
public class OrderServlet extends BaseServlet {
    OrderService orderService = new OrderServiceImpl();
    PurchaseService purchaseService = new PurchaseServiceImpl();

    public void purchase(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String count = req.getParameter("totalCount");
        String title = req.getParameter("DiyTitle");
        String comment = req.getParameter("DiyComment");
        String check = req.getParameter("captcha");
        String totalPrice = req.getParameter("totalPrice");
        HttpSession session = req.getSession();
        LoginUser loginUser = new LoginUser();
        String checkcode_server = (String)session.getAttribute("CHECKCODE_SERVER");
        session.removeAttribute("CHECKCODE_SERVER");
        if (checkcode_server == null || !checkcode_server.equalsIgnoreCase(check)) {
            ResultInfo resultInfo = new ResultInfo();
            resultInfo.setFlag(false);
            resultInfo.setErrorMsg("验证码错误");
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(resultInfo);
            resp.setContentType("application/json;charset=utf-8");
            resp.getWriter().write(json);
            System.out.println("验证码错误结束registUserServlet");
            return;
        }
        loginUser.setCustomer_id(1);
        loginUser = (LoginUser) session.getAttribute("user");

        int totalCount = Integer.parseInt(count);
        purchaseService.insert(title,loginUser.getCustomer_id(),comment,totalPrice);
        int p_count = purchaseService.getCount();
        for(int i = 1;i<=totalCount;i++)
        {
            String temp1 = req.getParameter("id"+i);
            int P_ID = Integer.parseInt(temp1);
            String temp2 = req.getParameter("count"+i);
            float count_temp = Integer.parseInt(temp2);
            orderService.insert(P_ID,loginUser.getCustomer_id(),comment,p_count,count_temp);
        }



    }
}
