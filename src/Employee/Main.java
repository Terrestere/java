package Employee;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = {
                new Employee("Fedr", 5000),
                new Employee("Stas", 2000),
                new Employee("Ivan", 5300)};

                Report.generateReport(employee);
    }


    public static class Employee {
        private String fullname;
        private double salary;

        public Employee(String fullname, double salary) {
            this.fullname = fullname;
            this.salary = salary;
        }

        public String getFullname() {
            return fullname;
        }

        public void setFullname(String fullname) {
            this.fullname = fullname;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

    }

    public static class Report {
        public static void generateReport(Employee[] employees) {
            System.out.printf("|     ФИО     | %8s |%n", "Оклад");
            for (Employee employee : employees) {
                String[] fio = employee.getFullname().split("\\s+");
                System.out.printf(Locale.ROOT, "|  %10s.|%10.2f|%n",

                        fio[0], employee.getSalary());
            }
        }
    }

}