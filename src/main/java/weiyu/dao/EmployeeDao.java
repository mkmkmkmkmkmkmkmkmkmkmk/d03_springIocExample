package weiyu.dao;

import weiyu.domain.Employee;

import java.util.List;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-23_周四 07:38
 **/
public interface EmployeeDao {
    List<Employee> findallEmps();
}
