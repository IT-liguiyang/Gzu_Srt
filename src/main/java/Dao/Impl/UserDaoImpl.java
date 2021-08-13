package Dao.Impl;

import Dao.UserDao;
import Util.JDBCUtils;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import domain.LoginUser;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {
    JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public LoginUser findByUsername(LoginUser user) {
        LoginUser u = null;
        String sql = "select * from customer_login where username = ?";
        try{
            u = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<LoginUser>(LoginUser.class),user.getUsername());
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }

        return u;
    }

    @Override
    public void saveLogin(LoginUser user) {
        String sql = "INSERT INTO `customer_login` (`username`,`password`,customer_email,user_stats,`code`) values(?,?,?,?,?);";
        try {
        jdbcTemplate.update(sql,user.getUsername(),user.getPassword(),user.getCustomer_email(),user.getUser_stats(),user.getCode());
        }
        catch (Exception e)
        {
            System.out.println("wrong");
        }
    }


    @Override
    public void updateUserStats(LoginUser User) {
         String sql ="UPDATE customer_login SET user_stats = 2 where customer_id = ?;";
        try {
            jdbcTemplate.update(sql,  User.getCustomer_id());
        }
         catch (Exception e)
            {
                System.out.println(e.toString());
            }
    }

    @Override
    public LoginUser findByCode(String code) {
        LoginUser loginUser = null;
        String sql = "select * from customer_login where code = ?";
        try {
            loginUser = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<LoginUser>(LoginUser.class), code);
        }
         catch (Exception e)
         {
                System.out.println(e.toString());
         }
        return loginUser;
    }

    @Override
    public LoginUser getUserByUserNameAndPassword(String Username, String password) {
          LoginUser user = null;
          String sql = "select * from customer_login where username = ? and password = ?";
          try{
              user = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<LoginUser>(LoginUser.class),Username,password);
          }
          catch (Exception e)
          {
              System.out.println(e.toString());
          }

          return user;
    }
}
