import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodsCalculator {
    Scanner sc = new Scanner(System.in);
    double value = 0;
    boolean invalidValue = true;
    String operation;

    public double setValue() {
        while (invalidValue) {
            try {
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.err.println("Error: Invalid value.");
                System.out.println("Let's try again. Please, enter the integer or double:");
                sc.next();
            }
        }
        return value;
    }

    public String setOperation() throws NotSupportedOperation {
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
}

