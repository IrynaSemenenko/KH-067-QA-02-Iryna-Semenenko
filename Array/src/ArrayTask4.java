import java.util.Scanner;

public class ArrayTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userAction, enterWords, enterValue;
        String[] words;
        int enterInt;
        boolean end = false;
        int findValue;
        do {
            System.out.println("Enter 3 or more words separated by commas without gaps");
            enterWords = sc.nextLine();
            words = enterWords.split(",");
            if (!enterWords.contains(",") || words.length < 3) {
                System.out.println("Something wrong! You should enter 3 or more words separated by commas without gaps ");
            } else {
                end = true;
            }
        } while (!end);
        do {
            System.out.println("Choose an action with an array of words and enter a number: ");
            System.out.println("1 - maximum length ");
            System.out.println("2 - start with");
            System.out.println("3 - end with");
            System.out.println("4 - contains");
            System.out.println("0 - exit");
            userAction = sc.next();
            findValue = 0;
            switch (userAction) {
                case "1" -> {
                    System.out.println("Enter the integral for the length word");
                    enterInt = sc.nextInt();
                    System.out.println("Result: ");
                    for (String i : words) {
                        if (i.length() <= enterInt) {
                            ++findValue;
                            System.out.println(i);
                        }
                    }
                    if (findValue == 0) System.out.println("Did not find any value, ");
                }
                case "2" -> {
                    System.out.println("Enter the letter for the start with word");
                    enterValue = sc.next();
                    System.out.println("Result: ");
                    for (String i : words) {
                        if (i.startsWith(enterValue)) {
                            ++findValue;
                            System.out.println(i);
                        }
                    }
                    if (findValue == 0) System.out.println("Did not find any value");
                }
                case "3" -> {
                    System.out.println("Enter the letter for the end with word");
                    enterValue = sc.next();
                    System.out.println("Result: ");
                    for (String i : words) {
                        if (i.endsWith(enterValue)) {
                            ++findValue;
                            System.out.println(i);
                        }
                    }
                    if (findValue == 0) System.out.println("Did not find any value");
                }
                case "4" -> {
                    System.out.println("Enter the letters for the part of word");
                    enterValue = sc.next();
                    System.out.println("Result: ");
                    for (String i : words) {
                        if (i.contains(enterValue)) {
                            ++findValue;
                            System.out.println(i);
                        }
                    }
                    if (findValue == 0) System.out.println("Did not find any value");
                }
                case "0" -> {
                    System.out.println("Exit");
                    System.out.println("Thanks for using our program");
                }
                default -> System.out.println("Something is wrong! You should enter number from 1 to 4 or 0");
            }
        }
        while (!userAction.equals("0"));
    }
}
