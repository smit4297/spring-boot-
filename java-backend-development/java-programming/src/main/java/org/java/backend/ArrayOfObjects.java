package org.java.backend;

class User {
    public int id;
    public String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Employee {
    public int id;
    public String employeeName;

    public Employee(int id, String employeeName) {
        this.id = id;
        this.employeeName = employeeName;
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        User user1 = new User(1, "krishna");
        User user2 = new User(2, "ram");
        Employee emp1 = new Employee(1, "ramEmp");

        Object[] arr = { user1, user2, emp1 };

        for (Object obj : arr) {
            if (obj instanceof User user) {
                System.out.println("name: " + user.name);
            } else if (obj instanceof Employee employee) {
                System.out.println("employeeName: " + employee.employeeName);
            }
        }
    }
}