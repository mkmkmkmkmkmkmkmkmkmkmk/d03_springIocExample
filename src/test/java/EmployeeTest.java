import domain.Employee;
import org.junit.Test;
import service.EmployeeService;
import service.impl.EmployeeServiceImpl;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-23_周四 07:53
 **/
public class EmployeeTest {
    @Test
    public void OriginalTest() {
        EmployeeService employeeService = new EmployeeServiceImpl();
        employeeService.findallEmps().forEach(System.out::println);
    }
}
