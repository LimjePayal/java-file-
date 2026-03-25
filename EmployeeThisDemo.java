class Employee {
    String name;
    double salary;

    // Constructor using this keyword
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Main class
public class EmployeeThisDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Payal", 30000);
        Employee e2 = new Employee("Rahul", 40000);

        e1.display();
        e2.display();
    }
}