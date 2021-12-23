package weiyu.dao.impl;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import weiyu.domain.Employee;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-23_周四 18:49
 **/
@Data
@Repository
public class EmployeeDaoImpl2 {
      /*   @Autowired相当于：
      *<bean id="employee" class="weiyu.domain.Employee"/>
      *<bean id="userDaoImpl2" class="weiyu.dao.impl.EmployeeDaoImpl2">
      *   <property name="employee" ref="employee"/>
      *</bean>
      */
      //自动注入依赖的对象(前提是被注入的对象在spring容器中) <br/>
      //1、带有该注解的方法或者字段，将会由spring调用<br />
      //2、如果被注入的对象在spring容器中发现了多个（先按照类型注入) <br />
      //3、按照方法的参数名或字段名再次查找对象并注入(后按照名称)

    //@Autowired
    //@Qualifier("employee")//不能单独使用，配合上面注解表示按照名字查找对象
    @Resource(name="employee")
    private Employee employee;


    @Override
    public String toString() {
        return "EmployeeDaoImpl2{" +
                "employee=" + employee +
                '}';
    }
}
