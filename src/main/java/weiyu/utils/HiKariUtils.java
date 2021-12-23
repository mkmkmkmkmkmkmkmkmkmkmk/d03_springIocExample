package weiyu.utils;

import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *1. 原生方式：没有解耦
 */
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
