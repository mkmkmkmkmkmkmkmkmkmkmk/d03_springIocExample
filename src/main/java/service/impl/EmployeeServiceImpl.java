package service.impl;

import dao.EmployeeDao;
import dao.impl.EmployeeDaoImpl;
import domain.Employee;
import service.EmployeeService;

import java.util.List;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-23_周四 07:49
 **/
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao dao = new EmployeeDaoImpl();
    @Override
    public List<Employee> findallEmps() {
        return dao.findallEmps();
    }
}
