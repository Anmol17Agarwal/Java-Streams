/*
Write a code in Java Stream to find average of Top 2 salary of each department Department
*/



import java.util.*;
import java.util.stream.*;

public class EmployeeAverageExample {

    static class Employee {
        private int id;
        private int departmentId;
        private double salary;

        public Employee(int id, int departmentId, double salary) {
            this.id = id;
            this.departmentId = departmentId;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public int getDepartmentId() {
            return departmentId;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Emp{id=" + id + ", dept=" + departmentId + ", sal=" + salary + "}";
        }
    }

    public static void main(String[] args) {
        // Create 5 departments × 10 employees = 50 employees
        List<Employee> employees = new ArrayList<>();
        Random random = new Random();

        int idCounter = 1;
        for (int dept = 1; dept <= 5; dept++) {
            for (int i = 1; i <= 10; i++) {
                double salary = 30000 + random.nextInt(50000); // 30k–80k
                employees.add(new Employee(idCounter++, dept, salary));
            }
        }

        // Group by department and compute average of first two salaries
        Map<Integer, Double> avgFirstTwoSalaryPerDept =
            employees.stream()
                .collect(Collectors.groupingBy(
                    Employee::getDepartmentId,
                    Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> list.stream()
                            .sorted(Comparator.comparingDouble(Employee::getSalary)) // sort by salary
                            .limit(2) // take first two
                            .mapToDouble(Employee::getSalary)
                            .average()
                            .orElse(0.0)
                    )
                ));

        // Print result
        avgFirstTwoSalaryPerDept.forEach((dept, avg) ->
            System.out.println("Department " + dept + " → Avg of first two salaries: " + avg)
        );
    }
}
