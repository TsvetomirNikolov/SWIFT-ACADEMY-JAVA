package pkg05.objects.and.classess.Task4_EmployeeSalarySort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Second way for Employee
public class Employee {

    String name;
    double salary;
    String position;
    String department;
    int age;
    String email;

    Employee(String name, double salary, String position, String department, int age, String email) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.age = age;
        this.email = email;
    }

    Employee(String name, double salary, String position, String department, String email) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = " ";
    }

    public Employee(String name, double salary, String position, String department, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.age = age;
    }

    public Employee(String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setEmail(String email) {
        if (email == null) {
            this.email = " ";
            return;
        }
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s", this.name, this.department, this.position, this.email);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee emp = null;
        int input = Integer.parseInt(scanner.nextLine());
        List<Employee> employeeList = new ArrayList<>();
        while (input-- > 0) {
            String[] arr = scanner.nextLine().split(", ");
            String name = arr[0];
            double salary = Double.parseDouble(arr[1]);
            String position = arr[2];
            String department = arr[3];
            String email = null;
            switch (arr.length) {
                case 6:
                    email = arr[5];
                    int age = Integer.parseInt(arr[4]);
                    emp = new Employee(name, salary, position, department, age, email);
                    break;
                case 4:
                    email = null;
                    emp = new Employee(name, salary, position, department, email);
                    break;
            }

            employeeList.add(emp);
        }
//        I dont know how to take from all elements in the list first 3 sorted, when use limit(3) it takes first 3 elements that is read from input
        employeeList.stream().limit(3).sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())).forEach(System.out::println);
    }
}
