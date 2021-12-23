import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import weiyu.dao.impl.EmployeeDaoImpl;
import weiyu.dao.impl.EmployeeDaoImpl1;
import weiyu.service.EmployeeService;
import weiyu.service.impl.EmployeeServiceImpl;

import static weiyu.utils.Base64Utils.encode;
import static weiyu.utils.Base64Utils.decode;

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
    /**
     * 6.注解IoC之Bean对象创建注解.@Componet=@Service=@Controller=@Repository
     * 开启注解扫描
     */
    @Test
    public void ComponetTest(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //EmployeeDaoImpl1 employeeDaoImpl1= classPathXmlApplicationContext.getBean("empDao", EmployeeDaoImpl1.class);
        EmployeeDaoImpl1 employeeDaoImpl1= classPathXmlApplicationContext.getBean("employeeDaoImpl1", EmployeeDaoImpl1.class);

        System.out.println(employeeDaoImpl1.toString());
    }
    /**
     * 7.测试@scope()
     */
    @Test
    public void ScopeTest(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //EmployeeDaoImpl1 employeeDaoImpl1= classPathXmlApplicationContext.getBean("empDao", EmployeeDaoImpl1.class);
        EmployeeDaoImpl1 employeeDaoImpl1= classPathXmlApplicationContext.getBean("employeeDaoImpl1", EmployeeDaoImpl1.class);
        EmployeeDaoImpl1 employeeDaoImpl2= classPathXmlApplicationContext.getBean("employeeDaoImpl1", EmployeeDaoImpl1.class);
        System.out.println(employeeDaoImpl1==employeeDaoImpl2);
    }
    /**
     * 8.测试@PostConstructor @PreDestroy（初始化和销毁方法）
     */
    @Test
    public void InitDestroyTest(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //EmployeeDaoImpl1 employeeDaoImpl1= classPathXmlApplicationContext.getBean("empDao", EmployeeDaoImpl1.class);
        EmployeeDaoImpl1 employeeDaoImpl1 = classPathXmlApplicationContext.getBean("employeeDaoImpl1", EmployeeDaoImpl1.class);
        EmployeeDaoImpl1 employeeDaoImpl2 = classPathXmlApplicationContext.getBean("employeeDaoImpl1", EmployeeDaoImpl1.class);
        System.out.println(employeeDaoImpl1==employeeDaoImpl2);
    }
}
