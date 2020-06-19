import java.util.Scanner;

public class word {
    public static void main(String[] args) {
        //You are to a write a program which asks a user to enter 10 words.
        // Save these words in an array.  Using the bubble sort algorithm (see below), sort the words in an ascending order.
        // For the output, print out the words in the original order, in the ascending order, and in the descending order.
        // Don't forget to write a pseudocode or flowchart BEFORE writing your code.
        //Your output should look something like this:
        //Original Order:
        //kiwi pineapple apple banana orange grapes watermelon cherry strawberry melon
        String fruit[] = new String[10];
        Scanner sc = new Scanner(System.in);
        int i, j;
        String t;
        for (i = 0; i < 10; i++)
            fruit[i] = sc.next();
        //int h=fruit.length;
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9 - i; j++) {
                if (fruit[j].compareTo(fruit[j + 1]) > 0) {
                    t = fruit[j];
                    fruit[j] = fruit[j + 1];
                    fruit[j + 1] = t;
                }
            }
        }
        for (i = 0; i < 10; i++)
            System.out.println(fruit[i]);
    }
}