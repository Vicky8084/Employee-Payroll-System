
public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem=new PayrollSystem();
        FullTymeEmployee emp1=new FullTymeEmployee("Vicky Gupta",1,700000.0);
        FullTymeEmployee emp2=new FullTymeEmployee("Sunny Gupta",2,8000000.0);
        PartTimeEmployee emp3=new PartTimeEmployee("rajan",3,400,125);
        PartTimeEmployee emp4=new PartTimeEmployee("ankush",4,300,320);
        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        payrollSystem.addEmployee(emp3);
        payrollSystem.addEmployee(emp4);
        System.out.println("Initial Employee Details: ");
        payrollSystem.displayEmployees();
        payrollSystem.removeEmployee(4);
        System.out.println("After removal Employee Details: ");
        payrollSystem.displayEmployees();
    }
}