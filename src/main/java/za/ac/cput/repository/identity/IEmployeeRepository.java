package za.ac.cput.repository.identity;

import za.ac.cput.entity.identity.Employee;
import za.ac.cput.repository.IRepository;

import java.util.List;

public interface IEmployeeRepository extends IRepository<Employee, String>{
    List<Employee>getAllEmployees();
    List<Employee>getAllEmployeesByFirstName(String firstName);
    List<Employee>getAllEmployeesByNationality(String nationality);
}
