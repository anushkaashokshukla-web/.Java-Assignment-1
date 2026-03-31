class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Anushka", 20);
        Person p2 = new Person("Rahul", 22);

        p1.display();
        System.out.println();
        p2.display();
    }
}