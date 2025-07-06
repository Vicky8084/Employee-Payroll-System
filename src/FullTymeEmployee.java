public class FullTymeEmployee extends Employee {
    private double monthlySalary;
    public FullTymeEmployee(String name,int id,double monthlySalary){
        super(name,id);
        this.monthlySalary=monthlySalary;
    }

    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}
