import java.util.Scanner;

public class ArrayTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userAction;
        String enterWords;
        String[] words;
        System.out.println("Enter several words separated by commas without gaps");
        enterWords = sc.nextLine();
        words = enterWords.split(",");
        String longestWord = words[0];
        do {
            System.out.println("Choose an action with an array of words and enter a number: ");
            System.out.println("1 - Find the longest word in an array");
            System.out.println("2 - Find first letter of each word");
            System.out.println("3 - Find last letter of each word");
            System.out.println("4 - Find part word of each words");
            System.out.println("0 - exit");
            userAction = sc.nextLine();
            switch (userAction) {
                case "1" -> {
                    for (String i : words) {
                        if (i.length() >= longestWord.length()) {
                            longestWord = i;
                        }
                    }
                    System.out.println("Your words: " + enterWords);
                    System.out.println("The longest word in an array: " + longestWord);
                }
                case "2" -> {
                    System.out.println("Your words: " + enterWords);
                    System.out.println("The first letters of each word: ");
                    for (String i : words) {
                        System.out.println(i.charAt(0));
                    }
                }
                case "3" -> {
                    System.out.println("Your words: " + enterWords);
                    System.out.println("The last letters of each word");
                    for (String i : words) {
                        System.out.println(i.substring(i.length() - 1));
                    }
                }
                case "4" -> {
                    System.out.println("Your words: " + enterWords);
                    System.out.println("The part of each words: ");
                    for (String i : words) {
                        if (i.length() <= 3) {
                            System.out.println(i);
                        } else if (i.length() <= 10) {
                            System.out.println(i.substring(1, i.length() - 2));
                        } else {
                            System.out.println(i.substring(5, i.length() - 2));
                        }
                    }
                }
            }
        } while (!userAction.equals("0"));
    }
}
