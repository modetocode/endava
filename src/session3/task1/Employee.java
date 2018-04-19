package session3.task1;

public class Employee {

    String name;
    int age;
    String surname;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int age) {
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
