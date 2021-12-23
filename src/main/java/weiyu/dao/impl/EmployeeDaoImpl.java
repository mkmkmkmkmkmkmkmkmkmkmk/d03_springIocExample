package weiyu.dao.impl;

import weiyu.dao.EmployeeDao;
import weiyu.domain.Employee;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-23_周四 07:40
 **/
//DBUtils使用前提:结果集字段名和实体类属性名保持一致
public class EmployeeDaoImpl implements EmployeeDao {
    //1. 原生方式：没有解耦
    //private QueryRunner qr=new QueryRunner(HiKariUtils.getDataSource());
    //2.使用springIoc解耦
    private QueryRunner qr;
    public void setQr(QueryRunner qr) {
        this.qr = qr;
    }
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
