package Calculator;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new BasicCalculator();
        boolean status=true;
        while(status){
        System.out.println("WELCOME TO CALCULATOR");
        System.out.println("=======================");
        System.out.print("ENTER THE FIRST NUMBER: ");
        double num1 = scanner.nextDouble();

        System.out.print("ENTER THE SECOND NUMBER: ");
        double num2 = scanner.nextDouble();

        System.out.println("SELECT AN OPERATION:");
        System.out.println("1. ADDITION");
        System.out.println("2. SUBSTRACTION");
        System.out.println("3. MULTIPLICATION");
        System.out.println("4. DIVISION");
        System.out.println("ENTER YOUR CHOICE: ");
        int choice = scanner.nextInt();
        double result;
        switch (choice) {
            case 1:
                result = calculator.add(num1, num2);
                System.out.println("++++++++++++++++++++++++");
                System.out.println("RESULT: " + result);
                System.out.println("++++++++++++++++++++++++");
                break;
            case 2:
                result = calculator.subtract(num1, num2);
                System.out.println("++++++++++++++++++++++++");
                System.out.println("RESULT: " + result);
                System.out.println("++++++++++++++++++++++++");
                break;
            case 3:
                result = calculator.multiply(num1, num2);
                System.out.println("++++++++++++++++++++++++");
                System.out.println("RESULT: " + result);
                System.out.println("++++++++++++++++++++++++");
                break;
            case 4:
                try {
                    result = calculator.divide(num1, num2);
                    System.out.println("++++++++++++++++++++++++");
                    System.out.println("RESULT: " + result);
                    System.out.println("++++++++++++++++++++++++");
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("++++++++++++++++++++++++");
                System.out.println("INVALID CHOICE!");
                System.out.println("++++++++++++++++++++++++");
                status = false;
        }
        }
    }
}
