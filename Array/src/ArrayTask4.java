import java.util.Scanner;

public class ArrayTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userAction;
        do {
            System.out.println("Enter 3 words separated by commas");
            String enterWords = sc.nextLine();
            String[] words = enterWords.split(",");
            System.out.println("Choose an action with an array of words and enter a number: ");
            System.out.println("1 - maximum length;");
            System.out.println("2 - start with;");
            System.out.println("3 - end with;");
            System.out.println("4 - contains;");
            System.out.println("0 - exit");
            userAction = sc.nextLine();
            switch (userAction) {
                case "1":
                    System.out.println("You add 1");
//                int index = 0;
//                int wordLength = words[0].length();
//                for (int i = 1; i < enterWords.length(); i++) {
//                    if (words[i].length() >= wordLength) {
//                        index = i;
//                        wordLength = words[i].length();
//                        System.out.println(words[index]);
//                    }
//                }
                    break;
                case "2":
                    System.out.println("You add 2");

                    break;
                case "3":
                    System.out.println("You add 3");
                    break;
                case "4":
                    System.out.println("You add 4");
                    break;

            }
        } while (userAction.equals(0));
    }

//    public static String findLongestWords() {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter 3 words separated by commas");
////        String enterWords = sc.nextLine();
//        String[] words = enterWords.split(",");
//        int maxSize = words.length;
//        String longestWord = words[0];
//        for (int i = 1; i < maxSize; i++) {
//            if (words[i].length() > longestWord.length()) {
//                longestWord = words[i];
//            }
//        }
//
//        return longestWord;
//    }

//    public String findLongestWord(String[] words) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 3 words separated by commas");
//        String enterWords = sc.nextLine();
//        words = enterWords.split(",");
//        int maxSize = words.length;
//        String longestWord = words[0];
//        for (int i = 1; i < maxSize; i++) {
//            if (words[i].length() > longestWord.length()) {
//                longestWord = words[i];
//            }
//        }
//
//        return longestWord;
//    }
}
