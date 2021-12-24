import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import weiyu.dao.impl.EmloyeeDaoImpl3;
import weiyu.dao.impl.EmployeeDaoImpl2;
import weiyu.service.impl.EmployeeServiceImpl3;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-24_周五 00:29
 **/
@RunWith(SpringJUnit4ClassRunner.class)//替换Junit原有的运行器，现有的运行器能够自动完成spring容器的初始化
@ContextConfiguration(locations = "classpath:applicationContext.xml")//指定spring配置文件的位置
public class JunitTest {
    @Autowired
    private EmployeeDaoImpl2 empDao2;
    @Autowired
    private EmployeeServiceImpl3 empService3;

    /**
     *  ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
     *   EmployeeDaoImpl2 employeeDaoImpl2 = classPathXmlApplicationContext.getBean("employeeDaoImpl2", EmployeeDaoImpl2.class);
     * <bean id="employee" class="weiyu.domain.Employee"
     * <bean id="empDao1" class="weiyu.dao.impl.EmployeeDaoImpl2">
     *             <property name="employee" ref="employee"/>
     * </bean>
     * 8.测试Junit整合
     */
    @Test
    public void JunitTest(){
        System.out.println(empDao2.toString());
    }
    /**
     * 10.测试用IOC改造为注解实现功能
     */
    /**
     *  <bean id="empDao" class="weiyu.dao.impl.EmloyeeDaoImpl3">
     *         <property name="qr" ref="qr"/>
     *     </bean>
     *     <bean id="empService3" class="weiyu.service.impl.EmployeeServiceImpl3">
     *         <property name="employeeDao" ref="empDao"/>
     *     </bean>
     */
    @Test
    public void IocAnnotationTest(){
        empService3.findallEmps().forEach(System.out::println);
    }
}
