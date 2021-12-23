package dao.impl;

import com.zaxxer.hikari.HikariDataSource;
import dao.EmployeeDao;
import domain.Employee;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import utils.HiKariUtils;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-23_周四 07:40
 **/
public class EmployeeDaoImpl implements EmployeeDao {
    //DBUtils使用前提:结果集字段名和实体类属性名保持一致
    private QueryRunner qr=new QueryRunner(HiKariUtils.getDataSource());
    @Override
    public List<Employee> findallEmps() {
        String sql="select * from t_employees";
        try {
            return qr.query(sql,new BeanListHandler<>(Employee.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
