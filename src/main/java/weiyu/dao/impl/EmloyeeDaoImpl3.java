package weiyu.dao.impl;

import lombok.Data;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import weiyu.dao.EmployeeDao;
import weiyu.domain.Employee;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-24_周五 09:29
 **/
@Data
@Repository
public class EmloyeeDaoImpl3 implements EmployeeDao {
    @Autowired
    private QueryRunner qr;


    @Override
    public List<Employee> findallEmps() {
        String sql="select * from t_employees";
        try {
            return qr.query(sql,new BeanListHandler<Employee>(Employee.class));
        } catch (SQLException e) {
          throw new RuntimeException("查询出错。。。");
        }
    }
}
