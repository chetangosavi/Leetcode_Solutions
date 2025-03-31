package leetcodesolutions.oops;

import java.util.*;

class Employees {
    private String name;
    private double salary;

    public Employees(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " - $" + salary;
    }
}

public class SortEmployeeCollection {

	public static void main(String[] args) {
        List<Employees> employees = new ArrayList<>();
        employees.add(new Employees("Alice", 50000));
        employees.add(new Employees("Bob", 70000));
        employees.add(new Employees("Charlie", 60000));

        // Sorting in descending order using Comparator
        employees.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));

        // Printing sorted employees
        System.out.println("Employees sorted by salary (Descending):");
        employees.forEach(System.out::println);
    }

}
