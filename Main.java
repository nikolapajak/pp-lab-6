import java.util.ArrayList;
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Harry", 2000, 1, "2022-01-01", "Junior Developer");
        Worker worker2 = new Worker("Ron", 1800, 2, "2023-03-15", "Senior Developer");
        Worker worker3 = new Worker("Syrius", 1900, 3, "2020-12-10", "Tester");
        Worker worker4 = new Worker("Hermione", 2100, 4, "2021-06-20", "Project Manager");

        Manager manager = new Manager("Draco", 5000, 5, "2019-05-10", "Department Head");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee emp : employees) {
            System.out.println("- " + emp.getName() + " (ID: " + emp.hashCode() +
                    ", Position: " + emp.getPosition() +
                    ", Hire date: " + emp.getHireDate() +
                    ", Salary: " + emp.getSalary() + ")");
            emp.work();
        }
    }
}