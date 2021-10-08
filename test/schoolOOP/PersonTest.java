package schoolOOP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void personHasANAmeTest()
    {
        Person person = new Person();
        person.name("Yetunde");
        assertEquals("Yetunde", person.getName());
    }
    @Test
    public void studentHasAName()
    {
        Student student = new Student();
        student.name("Boluwatife");
        assertEquals("Boluwatife", student.getName());
    }
    @Test
    public void employeeHasAName()
    {
        Employee employee = new Employee();
        employee.name("Boluwatife");
        assertEquals("Boluwatife", employee.getName());
    }
//    @Test
//    public void employeeHasDateHired()
//    {
//        Employee employee = new Employee();
//        employee.dateHired(06-12-2021);
//        assertEquals("2021-06-12", employee.getDateHired());
//    }

}