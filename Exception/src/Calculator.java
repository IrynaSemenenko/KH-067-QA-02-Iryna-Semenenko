public class Calculator {
    public static void main(String[] args) {
        MethodsCalculator methodsCalculator = new MethodsCalculator();
        System.out.println("It is a simple calculator. " +
                "\nIt performs simple arithmetic calculations using operations (+, -, /, *, %) " +
                "and supports non-integer numbers (4,5)\n" +
                "\nPlease, enter the first value: ");
        methodsCalculator.getFirstValue();
        System.out.println("Pleas, enter the operation value: ");
        methodsCalculator.checkOperation();
        System.out.println("Enter the second value: ");
        methodsCalculator.getSecondValue();
        methodsCalculator.getResult();
    }
}

