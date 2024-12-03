public class Employee{ 
    private int id;
    private String name; 
    private double salary;
    public Employee(int id, String name, double salary) { 
        this.id = id;
        this.name = name; 
        this.salary = salary;
    }
    public void raiseSalary(double percent) { 
        double increase = salary * (percent / 100); 
        salary += increase;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() { 
        return name;
    }
    public void setName(String name) { 
        this.name = name;
    }
    public double getSalary() { 
        return salary;
    }
    public void setSalary(double salary) { 
        this.salary = salary;
    }
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Salary: $" + salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(1, "John Doe", 50000); 
        System.out.println("Original Details:"); System.out.println(emp);
        emp.raiseSalary(10); 
        System.out.println("\nAfter 10% Raise:"); 
        System.out.println(emp);
    }
}