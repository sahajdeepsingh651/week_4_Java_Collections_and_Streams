import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Employee implements Serializable {
    private String id;
    private String name;
    private String department;
    private double salary;

    public Employee(String id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id +
                ", Name: " + name +
                ", Department: " + department +
                ", Salary: " + salary;
    }
}

public class Serialization {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("E001", "Alice", "HR", 50000));
        employeeList.add(new Employee("E002", "Bob", "IT", 70000));
        employeeList.add(new Employee("E003", "Charlie", "Finance", 60000));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Employees.ser"))) {
            oos.writeObject(employeeList);
            System.out.println("Employees serialized successfully.");
        } catch (IOException e) {
            System.err.println("Serialization error: " + e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Employees.ser"))) {
            List<Employee> deserializedList = (List<Employee>) ois.readObject();
            System.out.println("\nDeserialized Employee List:");
            for (Employee emp : deserializedList) {
                System.out.println(emp);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Deserialization error: " + e.getMessage());
        }
    }
}
