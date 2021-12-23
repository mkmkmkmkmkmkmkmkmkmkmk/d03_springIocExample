package weiyu.dao.impl;

import weiyu.dao.EmployeeDao;
import weiyu.domain.Employee;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

/**
 *6.将<bean id="empDao2" class="com.offcn. weiyu.dao.impl.Empl oyeeDaoImp12"/>变成
 *使用@Component("empDao2")配置
  */
//将当前类的对象交给spring容器管理，并且取名是empDao2
//@Component//如果没有指定名称，默达名称就是当前类的简单名称首字母小写。employeeDaolmpl2
@Component("empDao")
public class EmployeeDaoImpl1 {
    private String sting="EmployeeDaoImpl1";
    public void setSting(String sting) {
        this.sting = sting;
    }


    @Override
    public String toString() {
        return "EmployeeDaoImpl1{" +
                "sting='" + sting + '\'' +
                '}';
    }
}
