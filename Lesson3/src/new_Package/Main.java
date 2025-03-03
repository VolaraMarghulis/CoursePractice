package new_Package;

import new_Package.employee_Package.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John");
        System.out.println(employee.info());
    }
}
