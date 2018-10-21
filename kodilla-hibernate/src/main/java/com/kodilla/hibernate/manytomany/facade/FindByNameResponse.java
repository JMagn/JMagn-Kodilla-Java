package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;

import java.util.ArrayList;
import java.util.List;

public class FindByNameResponse {

    private List<Company> companies = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public void addCompany(Company company) {
        companies.add(company);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
