package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    public FindByNameResponse findByNameFragment(String arg) {
        FindByNameResponse findByNameResponse = new FindByNameResponse();

        List<Company> companiesByNameFragment = companyDao.findCompaniesByNameFragment("%" + arg + "%");
        for (Company company: companiesByNameFragment) {
            findByNameResponse.addCompany(company);
        }
        List<Employee> employeesByNameFragment = employeeDao.findEmployeesByNameFragment("%" + arg + "%");
        for (Employee employee: employeesByNameFragment) {
            findByNameResponse.addEmployee(employee);
        }
        return findByNameResponse;
    }
}