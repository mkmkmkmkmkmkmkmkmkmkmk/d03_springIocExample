import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import weiyu.dao.impl.EmployeeDaoImpl2;

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
}
