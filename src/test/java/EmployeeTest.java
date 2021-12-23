import domain.Employee;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.EmployeeService;
import service.impl.EmployeeServiceImpl;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-23_周四 07:53
 **/
public class EmployeeTest {
    /**
     *1. 原生方式：没有解耦
     */
    @Test
    public void OriginalTest() {
        EmployeeService employeeService = new EmployeeServiceImpl();
        employeeService.findallEmps().forEach(System.out::println);
    }
    /**
     * 2.使用springIoc解耦
     */
    @Test
    public void IocTest(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService employeeService= classPathXmlApplicationContext.getBean("empService",EmployeeService.class);
        employeeService.findallEmps().forEach(System.out::println);
    }
}
