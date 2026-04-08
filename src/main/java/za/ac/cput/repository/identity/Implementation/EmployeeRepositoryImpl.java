package za.ac.cput.repository.identity.Implementation;

import za.ac.cput.entity.identity.Employee;
import za.ac.cput.repository.identity.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements IEmployeeRepository {

    //1. Create the ArrayList;
    List<Employee> employeesList;

    //2. Create the EmployeeRepositoryImpl constructor;
    public EmployeeRepositoryImpl() {
        employeesList = new ArrayList<>();
    }
    //3. Singleton
    //Create an Instance object of the Interface class and make it null;
    public static EmployeeRepositoryImpl employeeRepository = null;
    //Check for Validation
    public static IEmployeeRepository getEmployeeRepository(){
        if (employeeRepository == null){
            employeeRepository = new  EmployeeRepositoryImpl();
        }
        return employeeRepository;
    }

    @Override
    public Employee create(Employee employee) {
        boolean success = employeesList.add(employee);
        if (success){
            return employee;
    }
        return null;
    }

    @Override
    public Employee read(String string) {
       for (Employee employee : employeesList){
           if (employee.getFirstName().equalsIgnoreCase(string)){
               return employee;
           }
       }
       return null;
    }

    @Override
    public Employee update(Employee employee) {
        Employee oldEmp = read(employee.getFirstName());
        if (oldEmp != null){
            employeesList.remove(oldEmp);
            employeesList.add(employee);
            return employee;
        }
        return null;
    }

    @Override
    public boolean delete(String string) {
        Employee oldEmp = read(string);
        if (oldEmp != null){
            employeesList.remove(oldEmp);
            return true;
        }
        return false;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeesList;
    }

    @Override
    public List<Employee> getAllEmployeesByFirstName(String firstName) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employeesList) {
            if (employee.getFirstName().equalsIgnoreCase(firstName)) {
                result.add(employee);
            }
        }
        return result;
    }

    @Override
    public List<Employee> getAllEmployeesByNationality(String nationality) {
        List<Employee> results = new ArrayList<>();
        for (Employee employee : employeesList){
            if (employee.getNationality().equalsIgnoreCase(nationality)){
                results.add(employee);
            }
        }
        return results;
    }
}
