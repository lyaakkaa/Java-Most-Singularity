package kz.leila;


class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("John Doe", "Engineer", "johndoe@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Jane Smith", "Manager", "janesmith@mailbox.com", "892312313", 40000, 45);
        employees[2] = new Employee("Michael Brown", "Analyst", "michaelbrown@mailbox.com", "892312314", 35000, 50);
        employees[3] = new Employee("Emily Davis", "Developer", "emilydavis@mailbox.com", "892312315", 45000, 35);
        employees[4] = new Employee("David Wilson", "Designer", "davidwilson@mailbox.com", "892312316", 32000, 55);

        System.out.println("Employees older than 40:");
        for (Employee employee : employees) {
            if (employee.age > 40) {
                employee.printInfo();
            }
        }
    }
}
