package Dao.Impl;

import Dao.ComDao;
import Util.JDBCUtils;
import domain.Company;
import org.springframework.jdbc.core.JdbcTemplate;

public class ComDaoImpl implements ComDao {

    JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public void insCom(Company company) {
        String sql = "INSERT INTO `company` (cname,address,email,tel,per_charge,`describe`) values(?,?,?,?,?,?);";
        try
        {
            template.update(sql,company.getCname(),company.getAddress(),company.getEmail(),company.getTel(),company.getPer_charge(),company.getDescribe());
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }

    }
}
