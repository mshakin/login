package com.example.ems.login.service;

import com.example.ems.login.Dto.UserDto;
import com.example.ems.login.entity.Department;
import com.example.ems.login.entity.Employee;
import com.example.ems.login.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
    List<Department> listAll();
    List<Employee> getAllEmployees();
    Employee saveEmployee(Employee employee);
    Employee getEmployeeByUsername(Long id);
    Employee updateEmployee(Employee employee);
    void deleteEmployeeByUsername(Long id);
}
