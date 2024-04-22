class Employee {

    private String name;
    private int age;
    private int salary;
    
    public Employee (String name, int age) {
    setName(name);
    setAge(age);
    setSalary(2000);
    }
    
    public Employee (String name, int age, int salary) {
    this(name, age);
    setSalary(salary);
    }
    
    public void setName(String name){this.name=name;}
    public void setAge(int age){this.age=age;}
    public void setSalary(int salary){this.salary=salary;}
    
    public void printDetails() {
    System.out.println(name + " : " + salary);
    }
}


public class Test {

    public static void main(String[] args) {
    
        Employee e1 = new Employee(); // Error
        Employee e2 = new Employee("Jack", 50);
        Employee e3 = new Employee("Chloe", 40, 5000);
        
        e1.printDetails();
        e2.printDetails();
        e3.printDetails();
    }
    }
