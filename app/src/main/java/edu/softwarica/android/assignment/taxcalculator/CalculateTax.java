package edu.softwarica.android.assignment.taxcalculator;

public class CalculateTax {
    private float salary;
    private float totalTax;

    public CalculateTax(float salary, float totalTax) {
        this.salary = salary;
        this.totalTax = totalTax;
    }

    public float getTotalTax() {
        return totalTax;
    }

    public CalculateTax() {
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

   public float taxCalculationOne(float salary){
        float tax;
        tax = salary * 1 /100;
        return tax;
   }

   public float taxCalculationFifteen(float salary){
        float tax;
        tax = salary * 15/100;
        return tax;
   }

   public float taxCalculationTwentyFive(float salary){
        float tax;
        tax = salary * 25/100;
        return tax;
   }

   public String displayTax(){
        float tax;
        annualSalary(salary);
        if (salary <= 200000){
            tax = taxCalculationOne(salary);
            return "" + tax;
        }
        else if (salary <=350000){
            tax = taxCalculationFifteen(salary - 200000) + taxCalculationOne(200000);
            return "" + tax;
        }
        else {
            tax = taxCalculationFifteen(150000) + taxCalculationOne(200000)
            + taxCalculationTwentyFive(salary - 350000);
            return "" + tax;
        }
   }

   public void annualSalary(float salary){

        this.salary = salary * 12;
   }

}
