package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    public void employeeHasFirstName(){
        // given
        Employee name = new Employee();
        //when
        name.firstName("Yetunde");
        //assert
        assertEquals("Yetunde", name.getFirstName());
    }

    @Test
    public void employeeHasLastName(){
        //given
        Employee name = new Employee();
        //when
        name.lastName("Olasehinde");
        //assert
        assertEquals("Olasehinde", name.getLastName());
    }

    @Test
    public void employeeMonthlySalary(){
        //given
        Employee salary = new Employee();
        //when
        salary.monthlySalary(50000.44);
        //assert
        assertEquals(5000.44, salary.getMonthlySalary());

    }

    @Test
    public void employeeOneYearlySalary(){
        //given
        Employee employee = new Employee();
        employee.monthlySalary(50000.00);
        //when
        // assert
        assertEquals(600000.00, employee.getYearlySalary());

        System.out.printf("Employee yearly salary is %f", employee.getYearlySalary());
    }

    @Test
    public void  employeeTwoYearlySalary(){
        //given
        Employee employee = new Employee();
        employee.monthlySalary(-80000.00);
        //when
        //assert
        assertEquals(960000.00, employee.getYearlySalary());
        System.out.printf("Employee yearly salary is %f", employee.getYearlySalary());
    }
    @Test
    public void employeeOneSalaryCanBeIncreasedBy10Percent(){
        //given
        Employee employee = new Employee();
        employee.monthlySalary(50000.00);
        //when
        employee.increaseSalary();
        //assert
        assertEquals(660000.00, employee.getYearlySalary());
        System.out.printf("Employee yearly salary is %f", employee.getYearlySalary());

    }

    @Test
    public void employeeTwoSalaryCanBeIncreased(){
        //given
        Employee employee = new Employee();
        employee.monthlySalary(80000.00);
        //when
        employee.increaseSalary();
        //assert
        assertEquals(1056000.00, employee.getYearlySalary());
        System.out.printf("Employee yearly salary is %f", employee.getYearlySalary());

    }


}