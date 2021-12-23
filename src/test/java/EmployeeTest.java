import domain.Employee;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.EmployeeService;
import service.impl.EmployeeServiceImpl;

import static utils.Base64Utils.encode;
import static utils.Base64Utils.decode;

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
     * 3.引入外部的属性配置文件jdbc.properties
     */
    @Test
    public void IocTest(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService employeeService= classPathXmlApplicationContext.getBean("empService",EmployeeService.class);
        employeeService.findallEmps().forEach(System.out::println);
    }
    /**
     * 4.加密测试
     */
    @Test
    public void enDecodeTest(){
        System.out.println("encodeun:"+encode("root"));
        System.out.println("encodeps:"+encode("123456"));
    }
    /**
     * 4.加密测试
     */
    @Test
    public void DecodeTest(){
        System.out.println("encodeun:"+decode("cm9vdA=="));
        System.out.println("encodeps:"+decode("MTIzNDU2"));
    }

    /**
     * 5.测试使用Base64编码解码properties配置文件的username,password
     */
    @Test
    public void decodeTest(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService employeeService= classPathXmlApplicationContext.getBean("empService",EmployeeService.class);
        employeeService.findallEmps().forEach(System.out::println);
    }
}
