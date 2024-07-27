import java.util.Scanner;

public class ifStatements {
    public static void main(String [] args) {
        //if statements are used to perform a block of statement if the given condition is true, if false execution moves to the next else if/else block of statements

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your age: ");
        int age = in.nextInt();

        if (age < 18) {
            System.out.println("Not Eligible to vote!");
        } else if (age == 18) {
            System.out.println("Eligible only if turned 18 6 months or more!");
        } else {
            System.out.println("Eligible to vote");
        }
    }
}