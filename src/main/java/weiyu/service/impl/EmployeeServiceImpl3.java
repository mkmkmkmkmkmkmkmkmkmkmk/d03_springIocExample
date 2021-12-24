package weiyu.service.impl;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import weiyu.dao.EmployeeDao;
import weiyu.domain.Employee;
import weiyu.service.EmployeeService;

import java.util.List;

@Data
@Service
public class EmployeeServiceImpl3 implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> findallEmps() {
        return employeeDao.findallEmps();
    }

}
