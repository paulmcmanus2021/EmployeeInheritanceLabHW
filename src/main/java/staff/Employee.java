package staff;

public abstract class Employee {

private String name;
private int niNumber;
private double salary;

    public Employee(String name, int niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(Double raiseAmount){
        return raiseAmount += this.salary;
    }

    public double payBonus(){
        return this.salary / 100;
    }
}
