public class Calculator {
    public static void main(String[] args) {
        MethodsCalculator methodsCalculator = new MethodsCalculator();
        double firstValue, secondValue, result;
        boolean invalidOperation = true;
        String operation = "";
        System.out.println("It is a simple calculator.");
        System.out.println("It performs simple arithmetic calculations using operations (+, -, /, *, %) and supports non-integer numbers (4,5)\n");
        System.out.println("Pleas, enter the first value: ");
        firstValue = methodsCalculator.setValue();
        System.out.println("Pleas, enter the operation value: ");
        while (invalidOperation) {
            try {
                operation = methodsCalculator.setOperation();
                invalidOperation = false;
            } catch (NotSupportedOperation notSupportedOperation) {
                System.err.println("Error: Invalid operation. Should be +, -, /, *, % operations. ");
                System.out.println("Let's try again! Please, enter the operation:");
            }
        }
        System.out.println("Enter the second value: ");
        secondValue = methodsCalculator.setValue();
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

