package exam_project_internal;

public class interest {

    public void simple_interest(double principal, double rate, double time) {
        double interest = (principal * rate * time) / 100;
        double totalAmount = principal + interest;

        System.out.println("Principal amount: " + principal);
        System.out.println("Rate of interest: " + rate + "%");
        System.out.println("Time (in years): " + time);
        System.out.println("Simple Interest: " + interest);
        System.out.println("Total Amount (Principal + Interest): " + totalAmount);
    }

    public static void main(String[] args) {
        interest interestCalculator = new interest();

        double principalAmount = 1000.0;
        double interestRate = 5.0;
        double timeInYears = 3.0; 
        
        interestCalculator.simple_interest(principalAmount, interestRate, timeInYears);
    }
}
