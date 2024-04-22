    class Employee{
        public int salary;
    }
    
    class Manager extends Employee{
        public int budget;
    }
    
    public class Director extends Manager{
    
        public int stockOptions;
    
        public static void main(String[] args) {

            Employee employee = new Employee();
            Employee manager = new Manager();
            Employee director = new Director();
            
            //director.stockOptions = 1_000; // Compilation Error
            employee.salary = 50_000;
            // manager.budget = 1_000_000; // Compilation Error
            // manager.stockOption = 500; // Compilation Error
            // employee.budget = 200_000; // Compilation Error
            director.salary = 80_000;
        
        }
    
    }