package utils;

import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-23_周四 07:29
 **/
public class HiKariUtils {
    private static HikariDataSource hikariDataSource =new HikariDataSource();
    static {
        hikariDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/ee1?useSSL=false&serverTimezone=UTC&characterEncoding=UTF-8&useUnicode=yes");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("123456");
    }
    public static HikariDataSource getDataSource(){
        return  hikariDataSource;
    }
    public static Connection getConnection() {
        try {
            return hikariDataSource.getConnection();
        } catch (SQLException e) {
          throw new RuntimeException("数据源初始化失败",e);
        }
    }
    

}
