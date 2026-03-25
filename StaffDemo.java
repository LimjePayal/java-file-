// Base class
class Staff {
    void work() {
        System.out.println("Staff is working");
    }
}

// Doctor class
class Doctor extends Staff {
    void work() {
        System.out.println("Doctor treats patients");
    }
}

// Nurse class
class Nurse extends Staff {
    void work() {
        System.out.println("Nurse takes care of patients");
    }
}

// Receptionist class
class Receptionist extends Staff {
    void work() {
        System.out.println("Receptionist manages appointments");
    }
}

// Main class
public class StaffDemo {
    public static void main(String[] args) {
        Staff s1 = new Doctor();
        Staff s2 = new Nurse();
        Staff s3 = new Receptionist();

        s1.work();
        s2.work();
        s3.work();
    }
}