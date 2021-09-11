package payroll;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours){ super(firstName, lastName, socialSecurityNumber);
    this.wage = wage;
    this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }


    @Override
    public double earnings() {
        if(getHours() <= 40){
            return getWage() * getHours();
        }else{
            return 40 * getWage()+(getHours() - 40)*getWage() * 1.5;
        }
    }

    @Override
    public String toString() {
        return String.format("Hourly employee",super.toString(), "Hourly wage", getWage(),"hours worked", getHours());
    }
}
