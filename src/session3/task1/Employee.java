package session3.task1;

public class Employee {

    String name;
    int age;
    String surname;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
