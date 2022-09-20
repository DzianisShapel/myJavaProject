package org.andersen.lab.lesson_3;

public class EmployeeRunner {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Dzianis Shapel", "Tester", "dzianis.shapel@gmail.com", "375297819364", 5000, 23);
        employees[1] = new Employee("Ivanov Ivan", "Developer", "ivanov.ivan@gmail.com", "375297819365", 6000, 40);
        employees[2] = new Employee("Petrov Petr", "HR", "petrov.petr@gmail.com", "375297819366", 7000, 45);
        employees[3] = new Employee("Sidorov Sidor", "BA", "sidorov.sidor@gmail.com", "375297819367", 8000, 49);
        employees[4] = new Employee("Axmat Axmatov", "CEO", "axmat.axmatov@gmail.com", "375297819368", 9000, 55);

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.describeEmployee();
            }
        }
    }
}
