package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeCompanyFacade {

    private final CompanyDao companyRepository;
    private final EmployeeDao employeeRepository;

    public EmployeeCompanyFacade(CompanyDao companyRepository, EmployeeDao employeeRepository) {
        this.companyRepository = companyRepository;
        this.employeeRepository = employeeRepository;
    }

    public List<Company> searchCompany(String nameFragment) {
        nameFragment = "%" + nameFragment + "%";
        return companyRepository.retrieveCompaniesWhichNameContains(nameFragment);
    }

    public List<Employee> searchEmployee(String nameFragment) {
        nameFragment = "%" + nameFragment + "%";
        return employeeRepository.retrieveEmployeesWhichLastNameContains(nameFragment);
    }
}
