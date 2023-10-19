package Employees;

public class SalariedEmployee extends Employees {
    public SalariedEmployee(String name, int age, double salary) {
        super(name, age, salary);
    }

    public double calculatePay() {
        return getSalary() / 12;
    }

}