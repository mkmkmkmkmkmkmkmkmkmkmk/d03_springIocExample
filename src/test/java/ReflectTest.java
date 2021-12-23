import org.junit.Test;

import java.lang.reflect.Field;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-23_周四 23:50
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
