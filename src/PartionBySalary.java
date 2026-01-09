import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartionBySalary {

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

        List<Employee> employee = new ArrayList<>();
        Employee employee1 = new Employee(2,102,150000);
        Employee employee2 = new Employee(3,103,40000);
        Employee employee3 = new Employee(4,104,90000);
        Employee employee4 = new Employee(5,105,120000);
        Employee employee5 = new Employee(6,106,120000);
        employee.add(employee1);
        employee.add(employee2);
        employee.add(employee3);
        employee.add(employee4);
        employee.add(employee5);

        Map<Boolean, List<Employee>> result =
                employee.stream()
                        .collect(Collectors.partitioningBy(e -> e.getSalary() > 100000));
        System.out.println(result);
    }
}
