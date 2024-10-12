class Employee {
    String EmployeeName;
    String EmployeeAge;
    String EmployeeSalary;
    String EmployeeRole;


    public Employee(String employeeName, String employeeRole, String employeeSalary, String employeeAge) {
        EmployeeName = employeeName;
        EmployeeRole = employeeRole;
        EmployeeSalary = employeeSalary;
        EmployeeAge = employeeAge;
    }

    public String getEmployeeSalary() {
        return EmployeeSalary;
    }

    public void setEmployeeSalary(String employeeSalary) {
        EmployeeSalary = employeeSalary;
    }

    public String getEmployeeRole() {
        return EmployeeRole;
    }

    public void setEmployeeRole(String employeeRole) {
        EmployeeRole = employeeRole;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getEmployeeAge() {
        return EmployeeAge;
    }

    public void setEmployeeAge(String employeeAge) {
        EmployeeAge = employeeAge;
    }


    /***
     *
     * In Java, the .toString() method is used to get a string representation of an object.
     * It is defined in the Object class, which means every class in Java inherits this
     * method. By default, the toString() method returns a string consisting of the class
     * name followed by the "@" symbol and the object's hash code, but this behavior can be
     * overridden to provide a more meaningful output.
     */
    @Override
    public String toString() {
        return
                "EmployeeName='" + EmployeeName + '\'' + "\n"+
                "EmployeeAge='" + EmployeeAge + '\'' + "\n"+
                "EmployeeSalary='" + EmployeeSalary + '\'' +"\n"+
                "EmployeeRole='" + EmployeeRole + '\'' ;

    }

}

public class ToStringMethod {
    public static void main(String[] args) {
        Employee Arham = new Employee("Arham", "Senior Full Stack Developer", "$200000", "20 Years");
        System.out.println(Arham);
    }
}
