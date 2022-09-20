package org.andersen.lab.lesson_3;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
    public void describeEmployee() {
        System.out.println("Employee name is: " + getFullName() + ". Position is: " + getPosition() + ". Email: "
                + getEmail() + ". Phone: " + getPhone() + ". Salary: " + getSalary() + ". Age: " + getAge() + ".");
    }
}
