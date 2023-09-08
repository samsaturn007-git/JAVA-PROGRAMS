class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this("John Doe"); // Calls the parameterized constructor
    }

    // Parameterized constructor
    public Person(String name) {
        this(name, 30); // Calls another constructor
    }

    // Another parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorChainingExample {
    public static void main(String[] args) {
        // Create Person objects using different constructors
        Person person1 = new Person();
        Person person2 = new Person("Alice");
        Person person3 = new Person("Bob", 25);

        // Display information
        System.out.println("Person 1:");
        person1.displayInfo();
        System.out.println();

        System.out.println("Person 2:");
        person2.displayInfo();
        System.out.println();

        System.out.println("Person 3:");
        person3.displayInfo();
    }
}
