import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstValue;
        double secondValue;
        String operation;
        double result;
        System.out.println("Enter the first number");
        if (sc.hasNextDouble()) {
            firstValue = sc.nextDouble();
            System.out.println("Input is correct: " + firstValue);
            System.out.println("Enter an operation (for example: +, -, *, /, %)");
            operation = sc.next();
            System.out.println(operation);
            if (operation.equals("+") |
                    operation.equals("-") |
                    operation.equals("*") |
                    operation.equals("/") |
                    operation.equals("%")) {
                System.out.println("User inputs supported operations");
                System.out.println("Enter the second number");
                if (sc.hasNextDouble()) {
                    secondValue = sc.nextDouble();
                    System.out.println("Input is correct: " + secondValue);
                    if (operation.equals("+")) {
                        result = firstValue + secondValue;
                        System.out.println("Result: " + firstValue + operation + secondValue + "=" + result);
                    } else if (operation.equals("-")) {
                        result = firstValue - secondValue;
                        System.out.println("Result: " + firstValue + operation + secondValue + "=" + result);
                    } else if (operation.equals("*")) {
                        result = firstValue * secondValue;
                        System.out.println("Result: " + firstValue + operation + secondValue + "=" + result);
                    } else if (operation.equals("/")) {
                        if (secondValue == 0) {
                            System.out.println("Division by '0' is impossible. Try to select another operation or enter other data");
                        } else {
                            result = firstValue / secondValue;
                            System.out.println("Result: " + firstValue + operation + secondValue + "=" + result);
                        }
                    } else {
                        result = firstValue % secondValue;
                        System.out.println("Result: " + firstValue + operation + secondValue + "=" + result);
                    }
                } else {
                    System.out.println("Input is wrong (should be a number)");
                }
            } else {
                System.out.println("User inputs unsupported operations");
            }
        } else {
            System.out.println("Input is wrong (should be a number)");
        }
    }
}
