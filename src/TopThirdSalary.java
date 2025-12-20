import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopThirdSalary {

    static class Employee {
        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        // Getters
        public String getName() { return name; }
        public double getSalary() { return salary; }

        @Override
        public String toString() {
            return name + " - " + salary;
        }
    }
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Alice", 90000),
                new Employee("Bob", 85000),
                new Employee("Charlie", 90000),
                new Employee("David", 70000),
                new Employee("Eve", 60000)
        );


        List<Double> top3Salaries = employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(3).skip(2)
                .collect(Collectors.toList());

        System.out.println("Top 3rd salaries: " + top3Salaries);
    }
}
