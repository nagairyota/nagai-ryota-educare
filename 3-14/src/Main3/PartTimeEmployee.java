package Main3;

public class PartTimeEmployee extends Employee{
    int hourlyWage;
    int hoursWorked;

    public PartTimeEmployee(String name, int hourlyWage, int hoursWorked){
        super(name);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getRole(){
        return "パートタイム";
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public int calculateSalary(){
        int result = this.hourlyWage * this.hoursWorked;
        return result;
    }
}
