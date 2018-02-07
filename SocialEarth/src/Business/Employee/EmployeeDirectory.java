/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Zone.Zone;
import java.util.ArrayList;

public class EmployeeDirectory {

    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public Employee createEmployee(String name, Zone zone, String city, String address) {
        Employee employee = new Employee();
        employee.setName(name);
        employee.setZone(zone);
        employee.setCity(city);
        employee.setAddress(address);
        employeeList.add(employee);
        return employee;
    }
    public Employee createEmployee(String name)
    {
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
}
