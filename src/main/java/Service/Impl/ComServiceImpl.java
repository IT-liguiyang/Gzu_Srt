package Service.Impl;

import Dao.ComDao;
import Dao.Impl.ComDaoImpl;
import Service.ComService;
import domain.Company;
import org.junit.jupiter.api.Test;

import javax.servlet.annotation.WebServlet;

public class ComServiceImpl implements ComService {
    ComDao comDao = new ComDaoImpl();
    @Override
    public void register(Company company) {
        comDao.insCom(company);
    }
    @Test
    void Test()
    {
        Company company = new Company("Com1","this is a address","123@163.com","this is tel",1,"this is dexcribe");
        register(company);
    }
}



