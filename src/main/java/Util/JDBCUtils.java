package Util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {
    private static DataSource ds;

    static{
        InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
        Properties properties = new Properties();
        try {
            properties.load(is);
            ds = DruidDataSourceFactory.createDataSource(properties);

        }
         catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static DataSource getDataSource() {return ds;}
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
    public static void close(Connection conn, Statement statement, ResultSet rs) throws SQLException {
        if(conn!=null){conn.close();}
        if(statement!=null){statement.close();}
        if(rs!=null) {rs.close();}
    }
    public static void close(Connection connection,Statement statement) throws SQLException {
        close(connection,statement,null);
    }

}
