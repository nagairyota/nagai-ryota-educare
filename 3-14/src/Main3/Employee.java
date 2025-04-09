package Main3;

public abstract  class Employee {
    String name;

    public Employee(String name){
        this.name = name;
    }
    public abstract int calculateSalary();
    public abstract String getName();
    public abstract String getRole();
}
