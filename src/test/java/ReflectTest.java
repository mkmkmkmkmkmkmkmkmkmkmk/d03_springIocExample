import org.junit.Test;

import java.lang.reflect.Field;

/**
 * 7.注解IoC之依赖注入
 **/
public class ReflectTest {
    @Test
    public void reflectTest(){
        Class clazz= null;
        try {
            clazz = Class.forName("weiyu.dao.impl.EmployeeDaoImpl2");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Field[] declaredFields1 = clazz.getDeclaredFields();
        for (Field declaredField: declaredFields1) {
            System.out.println(declaredField.getName());
        }

    }
}
