class Person {
    String name;
    int age;

    // Constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Person p1 = new Person("Payal", 20);
        Person p2 = new Person("Rahul", 22);

        p1.display();
        p2.display();
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> f0158c8446ec761590f6e991ee1f481f9e17b10b
