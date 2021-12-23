package weiyu.dao.impl;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import weiyu.domain.Employee;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-23_周四 18:49
 **/
@Data
@Repository
public class EmployeeDaoImpl2 {
  /*  <bean id="employee" class="weiyu.domain.Employee"/>
    <bean id="userDaoImpl2" class="weiyu.dao.impl.EmployeeDaoImpl2">
        <property name="employee" ref="employee"/>
    </bean>*/
    @Autowired
    private Employee employee;


    @Override
    public String toString() {
        return "EmployeeDaoImpl2{" +
                "employee=" + employee +
                '}';
    }
}
