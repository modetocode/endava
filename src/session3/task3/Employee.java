package session3.task3;

public class Employee {

    String name;
    Integer age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee(String name) {
        this.name = name;
        this.age = 30;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
