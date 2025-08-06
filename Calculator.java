import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        String choice;
        System.out.println("SIMPLE CALCULATOR!");
        System.out.println("You Can Perform Basic Arithmetic Operations: ADDITION, SUBTRACTION, MULTIPLICATION, and DIVISION.");
        do {
            System.out.print("Enter 1st Number: ");
            double X = obj.nextDouble();
            System.out.print("Enter The Operator(+, -, *, /): ");
            char O= obj.next().charAt(0);
            System.out.print("Enter 2nd Number: ");
            double Y = obj.nextDouble();
            double result;
            switch (O) {
                case '+':
                    result = X + Y;
                    System.out.println("Addition: " + result);
                    break;
                case '-':
                    result = X - Y;
                    System.out.println("Subtraction: " + result);
                    break;
                case '*':
                    result = X * Y;
                    System.out.println("Multiplication: " + result);
                    break;
                case '/':
                    if (Y != 0) {
                        result = X / Y;
                        System.out.println("Division: " + result);
                    } else {
                        System.out.println("Error: Cannot Divide by Zero(0)!");
                    }
                    break;
                default:
                    System.out.println("Invalid operator.");
            }
            System.out.print("Do You Want to Perform Another Calculation? (Yes/No): ");
            choice = obj.next();
        } while (choice.equals("Yes") || choice.equals("yes") || choice.equals("Y") || choice.equals("y") || choice.equals("1"));
        System.out.println("Calculator Closed!");
        System.out.println("Thank You for Using the Calculator!");
        obj.close();
    }
}
