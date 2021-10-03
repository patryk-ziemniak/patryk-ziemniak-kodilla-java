package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EmployeeCompanyFacadeTest {

    @Autowired
    private EmployeeCompanyFacade employeeCompanyFacade;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    private int softwareMachine;
    private int dataMaesters;
    private int greyMatter;
    private int johnSmith;
    private int stephanieClarckson;
    private int lindaKovalsky;

    private void prepareData() {
        softwareMachine = companyDao.save(new Company("Software Machine")).getId();
        dataMaesters = companyDao.save(new Company("Data Maesters")).getId();
        greyMatter = companyDao.save(new Company("Grey Matter")).getId();

        johnSmith = employeeDao.save(new Employee("John", "Smith")).getId();
        stephanieClarckson = employeeDao.save(new Employee("Stephanie", "Clarckson")).getId();
        lindaKovalsky = employeeDao.save(new Employee("Linda", "Kovalsky")).getId();
    }

    private void deleteData() {
        companyDao.deleteById(softwareMachine);
        companyDao.deleteById(dataMaesters);
        companyDao.deleteById(greyMatter);
        employeeDao.deleteById(johnSmith);
        employeeDao.deleteById(stephanieClarckson);
        employeeDao.deleteById(lindaKovalsky);
    }

    @Test
    void shouldReturnCompanyWhichNameContainsExactFragment() {
        //Given
        prepareData();

        //When
        List<Company> companies = employeeCompanyFacade.searchCompany("ware");

        //Then
        assertEquals(1, companies.size());
        assertEquals("Software Machine", companies.get(0).getName());

        //CleanUp
        deleteData();
    }

    @Test
    void shouldReturnEmployeeWhichLastNameContainsExactFragment() {
        //Given
        prepareData();

        //When
        List<Employee> employees = employeeCompanyFacade.searchEmployee("valsk");

        //Then
        assertEquals(1, employees.size());
        assertEquals("Linda", employees.get(0).getFirstname());
        assertEquals("Kovalsky", employees.get(0).getLastname());

        //CleanUp
        deleteData();
    }
}
