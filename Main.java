public class Main {
    public static void main(String[] args) {
        // Create a Full-Time Employee
        Employee emp1 = 
            new FullTimeEmployee("Alice", 5000.0);
        Employee emp2 = 
            new PartTimeEmployee("Bob", 40, 25.0);

        System.out.println("FULL-TIME");
        System.out.println(emp1);
        System.out.println("Salary: " + emp1.calculateSalary());

        System.out.println();

        System.out.println("PART-TIME");
        System.out.println(emp2);
        System.out.println("Salary: " + 
                emp2.calculateSalary());
    }
}
