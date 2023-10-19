package exam_project_internal;

public class caluculator {

    public void addition(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("Addition result: " + num1 + " + " + num2 + " = " + result);
    }

    public void subtraction(double num1, double num2) {
        double result = num1 - num2;
        System.out.println("Subtraction result: " + num1 + " - " + num2 + " = " + result);
    }

    public void multiplication(double num1, double num2) {
        double result = num1 * num2;
        System.out.println("Multiplication result: " + num1 + " * " + num2 + " = " + result);
    }

    public void division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Division by zero is not allowed. as it is Infinity");
        } else {
            double result = num1 / num2;
            System.out.println("Division result: " + num1 + " / " + num2 + " = " + result);
        }
    }

    public static void main(String[] args) {
        caluculator calculator = new caluculator();

        double operand1 = 10.0;
        double operand2 = 5.0;

        calculator.addition(operand1, operand2);
        calculator.subtraction(operand1, operand2);
        calculator.multiplication(operand1, operand2);
        calculator.division(operand1, operand2);
    }
}
