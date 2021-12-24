import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import weiyu.config.SpringConfig;
import weiyu.service.impl.EmployeeServiceImpl;
import weiyu.service.impl.EmployeeServiceImpl3;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-24_周五 11:14
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})//此处就可以省略SpringConfig类中的@Configuration
public class JunitConfigTest {
    @Autowired
    private EmployeeServiceImpl3 employService3;
    /**
     * 将 <bean class="weiyu.config.MyPropertyPlaceholderConfigurer">
     *         <property name="location" value="classpath:jdbc.properties"/>
     *         <constructor-arg name="needPropertyNames">
     *             <array>
     *                 <value>jdbc.user</value>
     *                 <value>jdbc.pass</value>
     *             </array>
     *         </constructor-arg>
     *     </bean>
     *     <bean id="dataSource" class="com.zaxxer.hikari.HikariDataSource">
     *         <property name="driverClassName" value="${jdbc.driverClassName}" />
     *         <property name="jdbcUrl" value="${jdbc.url}" />
     *         <property name="username" value="${jdbc.user}" />
     *         <property name="password" value="${jdbc.pass}"/>
     *     </bean>
     *     <bean id="qr" class="org.apache.commons.dbutils.QueryRunner">
     *         <constructor-arg name="ds" ref="dataSource"/>
     *     </bean> 去掉，使用spring的Class配置文件SpringConfig去配置数据源
     */
    /**
     * 11. 配置类配置spring的数据源.
     * 12.配置类配置spring的数据源，读取jdbc1.properties加载数据源配置文件
     */
    @Test
    public void  ConfigTset(){
        employService3.findallEmps().forEach(System.out::println);
    }
}
