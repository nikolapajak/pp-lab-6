import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Harry", 2000, 1, "2022-01-01", "Junior Developer");
        Worker worker2 = new Worker("Ron", 1800, 2, "2023-03-15", "Senior Developer");
        Worker worker3 = new Worker("Syrius", 1900, 1, "2020-12-10", "Tester");
        Manager manager = new Manager("Hermione", 5000, 3, "2019-05-10", "Department Head");

        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());

        
        System.out.println(worker3.getName() + " equals worker1: " + worker3.equals(worker1));
        System.out.println(worker3.getName() + " equals worker2: " + worker3.equals(worker2));
        System.out.println(worker3.getName() + " equals manager: " + worker3.equals(manager));
    }
}