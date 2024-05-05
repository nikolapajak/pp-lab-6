import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Harry", 2000, 1, "2022-01-01", "Junior Developer");
        Worker worker2 = new Worker("Ron", 1800, 2, "2023-03-15", "Senior Developer");
        Worker worker3 = new Worker("Syrius", 1900, 3, "2020-12-10", "Tester");
        Worker worker4 = new Worker("Hermione", 2100, 4, "2021-06-20", "Project Manager");
        Worker worker5 = new Worker("Draco", 2200, 5, "2021-06-20", "Project Manager"); // changed id to 5

        Manager manager1 = new Manager("Tom", 5000, 6, "2019-05-10", "Department Head"); // changed id to 6
        Manager manager2 = new Manager("Rubeus", 5500, 7, "2019-05-10", "CTO"); // changed id to 7

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(manager1);
        employees.add(manager2);

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;

        Map<Integer, List<Employee>> idMap = new HashMap<>();
        for (Employee emp : employees) {
            totalSalary += emp.getSalary();
            if (emp instanceof Manager) {
                totalManagerSalary += emp.getSalary();
            } else if (emp instanceof Worker) {
                totalWorkerSalary += emp.getSalary();
            }
            
            if (idMap.containsKey(emp.getId())) {
                idMap.get(emp.getId()).add(emp);
            } else {
                List<Employee> empList = new ArrayList<>();
                empList.add(emp);
                idMap.put(emp.getId(), empList);
            }
        }
        
        System.out.println("Total salary: " + totalSalary);
        System.out.println("Total manager salary: " + totalManagerSalary);
        System.out.println("Total worker salary: " + totalWorkerSalary);

        for (Map.Entry<Integer, List<Employee>> entry : idMap.entrySet()) {
            List<Employee> empList = entry.getValue();
            if (empList.size() > 1) {
                System.out.println("Employees with same ID: ");
                for (Employee emp : empList) {
                    System.out.println("- " + emp.getName());
                }
            }
        }
    }
}
