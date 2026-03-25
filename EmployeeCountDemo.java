class Employee {
    String name;
    int id;

    static int employeeCount = 0;

    // Constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    // Static method
    static void displayCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

// Main class
public class EmployeeCountDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Payal", 101);
        Employee e2 = new Employee("Rahul", 102);
        Employee e3 = new Employee("Sneha", 103);

        Employee.displayCount();
    }
}