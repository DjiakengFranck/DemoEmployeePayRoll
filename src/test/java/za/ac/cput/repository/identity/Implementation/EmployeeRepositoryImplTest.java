package za.ac.cput.repository.identity.Implementation;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.identity.Employee;
import za.ac.cput.factory.identity.EmployeeFactory;
import za.ac.cput.repository.identity.IEmployeeRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeeRepositoryImplTest {

    private static IEmployeeRepository employeeRepository = EmployeeRepositoryImpl.getEmployeeRepository();

    private Employee employee1 = EmployeeFactory.createEmployee("",
            "Micheal",
            "Johnson",
            "Ghana");
    private Employee employee2 = EmployeeFactory.createEmployee("",
            "Dimitri",
            "Damson",
            "Egypt");
    private Employee employee3 = EmployeeFactory.createEmployee("",
            "Skylar",
            "Simpson",
            "Ghana");
    private Employee employee4 = EmployeeFactory.createEmployee("",
            "Thiery",
            "Thompson",
            "Mali");

    @Test
    @Order(1)
    void create() {
        employeeRepository.create(employee1);
        employeeRepository.create(employee2);
        employeeRepository.create(employee3);
        employeeRepository.create(employee4);
        assertNotNull(employee1);
        assertEquals("Micheal", employee1.getFirstName());
        System.out.println("Employee created Successfully \n" +
                employee1);
    }

    @Test
    @Order(2)
    void read() {
        employeeRepository.read(employee1.toString());
        assertNotNull(employee1);
        System.out.println("Employee read successfully \n" +
                employee1);
    }

    @Test
    @Order(3)
    void update() {
        employeeRepository.create(employee1);
        Employee updatedEmp = new Employee.Builder()
                .copy(employee1)
                .setNationality("Ghanaian")
                .build();
        Employee results = employeeRepository.update(updatedEmp);
        //employeeRepository.update(employee1);
        assertNotNull(results);
        //assertEquals("Djanjo", results.getFirstName());
        assertEquals("Ghanaian", results.getNationality());
        System.out.println("Employee updated successfully \n" +
                            results.toString());
    }

    @Test
    @Order(4)
    void delete() {
      employeeRepository.create(employee1);
      boolean delete = employeeRepository.delete("Johnson");
        System.out.println(delete);
    }

    @Test
    @Order(5)
    void getAllEmployees() {
        employeeRepository.create(employee1);
        employeeRepository.create(employee2);
        employeeRepository.create(employee3);
        employeeRepository.create(employee4);
        List<Employee> employees = employeeRepository.getAllEmployees();
        assertNotNull(employees);
        assertFalse(employees.isEmpty());
        System.out.println(employees);
    }

    @Test
    @Order(5)
    void getAllEmployeesByFirstName() {
        employeeRepository.create(employee1);
        employeeRepository.create(employee2);
        employeeRepository.create(employee3);
        List<Employee> results = employeeRepository.getAllEmployeesByFirstName("Dimitri");
        assertEquals("Dimitri", employee2.getFirstName());
        assertNotNull(results);
        assertFalse(results.isEmpty());
        System.out.println(results);
    }

    @Test
    @Order(6)
    void getAllEmployeesByNationality() {
        employeeRepository.create(employee1);
        employeeRepository.create(employee2);
        employeeRepository.create(employee3);
        List<Employee> results = employeeRepository.getAllEmployeesByNationality("Ghana");
        assertNotNull(results);
        assertFalse(results.isEmpty());
        assertEquals("Ghana", employee1.getNationality());
        System.out.println(results);
    }
}