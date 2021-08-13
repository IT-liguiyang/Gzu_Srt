package Dao.Impl;

import Dao.PurchaseDao;
import Util.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class PurchaseDaoImpl implements PurchaseDao {
    JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public void insert(String purchaseName, Integer UId, String remark,String price) {
        String sql = "insert into purchase(P_NAME,U_ID,REMARK,TOTALPRICE) VALUES(?,?,?,?)";
        jdbcTemplate.update(sql,purchaseName,UId,remark,price);
    }

    @Override
    public int getCount() {
        String sql = "select count(P_ID) from purchase;";
        int temp = jdbcTemplate.queryForObject(sql, Integer.class);
        return temp;
    }
}
