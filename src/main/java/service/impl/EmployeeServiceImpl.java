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
    //1. 原生方式：没有解耦
    //private EmployeeDao dao = new EmployeeDaoImpl();
    //2.使用springIoc解耦
    private EmployeeDao dao;
    public void setDao(EmployeeDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Employee> findallEmps() {
        return dao.findallEmps();
    }
}
