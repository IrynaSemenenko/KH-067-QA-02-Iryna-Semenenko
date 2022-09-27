import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodsCalculator {
    double firstValue;
    double secondValue;
    double result;
    boolean invalidOperation = true;
    boolean invalidValue = true;
    String operation;

    public void getFirstValue() {
        Scanner sc = new Scanner(System.in);
        while (invalidValue) {
            try {
                firstValue = sc.nextDouble();
                return;
            } catch (InputMismatchException e) {
                System.err.println("Error: Invalid value.");
                System.out.println("Let's try again. Please, enter the integer or double:");
                sc.next();
            }
        }
    }

    public void getSecondValue() {
        Scanner sc = new Scanner(System.in);
        while (invalidValue) {
            try {
                secondValue = sc.nextDouble();
                return;
            } catch (InputMismatchException e) {
                System.err.println("Error: Invalid value.");
                System.out.println("Let's try again. Please, enter the integer or double:");
                sc.next();
            }
        }
    }

    public String getOperation() throws NotSupportedOperation {
        Scanner sc = new Scanner(System.in);
        operation = sc.next();
        if (operation.equals("+") |
                operation.equals("-") |
                operation.equals("/") |
                operation.equals("*") |
                operation.equals("%")) {
            return operation;
        } else {
            throw new NotSupportedOperation();
        }
    }

    public void checkOperation() {
        while (invalidOperation) {
            try {
                operation = getOperation();
                invalidOperation = false;
            } catch (NotSupportedOperation notSupportedOperation) {
                System.err.println("Error: Invalid operation. Should be +, -, /, *, % operations. ");
                System.out.println("Let's try again! Please, enter the operation:");
            }
        }
    }

    public void getResult() {
        switch (operation) {
            case "+" -> {
                result = firstValue + secondValue;
                System.out.println(firstValue + " + " + secondValue + " = " + result);
            }
            case "-" -> {
                result = firstValue - secondValue;
                System.out.println(firstValue + " - " + secondValue + " = " + result);
            }
            case "*" -> {
                result = firstValue * secondValue;
                System.out.println(firstValue + " * " + secondValue + " = " + result);
            }
            case "/" -> {
                if (secondValue != 0) {
                    result = firstValue / secondValue;
                    System.out.println(firstValue + " / " + secondValue + " = " + result);
                } else {
                    System.err.println(firstValue + " / " + secondValue + " = " + "Error: Divide by zero is impossible.");
                }
            }
            case "%" -> {
                result = firstValue % secondValue;
                System.out.println(firstValue + " % " + secondValue + " = " + result);
            }
        }
    }
}

