package Dao.Impl;

import Dao.OrderDao;
import Util.JDBCUtils;
import domain.Order;
import org.springframework.jdbc.core.JdbcTemplate;

public class OrderDaoImpl implements OrderDao {
    JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public void insert(int goodsId,int userId,String remarks,int P_ID, float tCount) {
        String sql = "insert into orders(goodsid,userid,remarks,P_ID,count) values(?,?,?,?,?)";
        jdbcTemplate.update(sql,goodsId,userId,remarks,P_ID,tCount);
    }
}
