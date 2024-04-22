    
    class Employee implements Badge{
        public int salary;

        public void displayBadge() {};
    }
    
    class Manager extends Employee{
        public int budget;

        public void displayBadge() {};
    }
    
    public class Director extends Manager{
    
        public int stockOptions;
        
        public void getStockOptions() {};

        public void displayBadge() { System.out.print("Director Badge"); };
    
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


            Director dir = new Director();
            dir.getStockOptions();
            dir.displayBadge();


            
        }
    
    }