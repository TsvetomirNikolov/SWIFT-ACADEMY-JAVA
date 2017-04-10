package pkg05.objects.and.classess.Task4_EmployeeSalarySortCorrect;

import java.util.Scanner;

public class Employee {

    String name;
    double salary;
    String position;
    String department;
    int age;
    String email;
    static Employee[] employee = new Employee[15];
    static int employeeCount = 0;

    public Employee(String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
    }

    public Employee(String name, double salary, String position, String department, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.age = age;
    }

    public Employee(String name, double salary, String position, String department, int age, String email) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.age = age;
        this.email = email;
    }

    public Employee(String name, double salary, String position, String department, String email) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
    }

    static void addEmployee(Employee newEmployee) {
        employee[employeeCount] = newEmployee;
        employeeCount++;
    }

    static void sortEmployee(Employee[] employee) {
        for (int row = 1; row < employee.length; row++) {
            for (int col = 0; col < employee.length - row; col++) {
                if (employee[col + 1] != null) {
                    if (employee[col].salary < employee[col + 1].salary) {
                        Employee temp = employee[col];
                        employee[col] = employee[col + 1];
                        employee[col + 1] = temp;
                    }
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int empAmount = scanner.nextInt();
        scanner.nextLine();
        String name;
        double salary;
        String position;
        String department;
        int age;
        String email;

        for (int i = 0; i < empAmount; i++) {
            String[] inputIndex = scanner.nextLine().split(", ");
            if (inputIndex.length <= 4) {
                name = inputIndex[0];
                salary = Double.parseDouble(inputIndex[1]);
                position = inputIndex[2];
                department = inputIndex[3];

                Employee newEmp = new Employee(name, salary, position, department);
                Employee.addEmployee(newEmp);
            } else if (inputIndex.length == 5) {
                if (inputIndex[4].length() <= 2) {
                    name = inputIndex[0];
                    salary = Double.parseDouble(inputIndex[1]);
                    position = inputIndex[2];
                    department = inputIndex[3];
                    age = Integer.parseInt(inputIndex[4]);

                    Employee newEmp = new Employee(name, salary, position, department, age);
                    Employee.addEmployee(newEmp);

                } else {
                    name = inputIndex[0];
                    salary = Double.parseDouble(inputIndex[1]);
                    position = inputIndex[2];
                    department = inputIndex[3];
                    email = inputIndex[4];

                    Employee newEmp = new Employee(name, salary, position, department, email);
                    Employee.addEmployee(newEmp);
                }
            } else if (inputIndex.length == 6) {
                name = inputIndex[0];
                salary = Double.parseDouble(inputIndex[1]);
                position = inputIndex[2];
                department = inputIndex[3];
                age = Integer.parseInt(inputIndex[4]);
                email = inputIndex[5];

                Employee newEmp = new Employee(name, salary, position, department, age, email);
                Employee.addEmployee(newEmp);
            }
        }
        scanner.close();
        Employee.sortEmployee(Employee.employee);
        for (int i = 0; i < 3; i++) {
            if (Employee.employee[i].email != null) {
                System.out.println(Employee.employee[i].name
                        + ", " + Employee.employee[i].position + ", "
                        + Employee.employee[i].department + ", " + Employee.employee[i].email);
            } else {
                System.out.println(Employee.employee[i].name
                        + ", " + Employee.employee[i].position + ", "
                        + Employee.employee[i].department);
            }
        }
        scanner.close();
    }
}
