
import java.util.Scanner;

public class switchCase {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choice;
        System.out.println("Enter 1 for Monday\n2 for Tuesday\n3 for Wednesday\n4 for Thursday\n5 for Friday\n6 for Saturday\n7 for Sunday");
        System.out.println("");
        choice = in.nextInt();

        // The switch statement is used to execute one block of code among many based on the value of the choice variable
        switch (choice) {
            case 1 -> // If choice is 1
                System.out.println("It's Monday");
            case 2 -> // If choice is 2
                System.out.println("It's Tuesday");
            case 3 -> // If choice is 3
                System.out.println("It's Wednesday");
            case 4 -> // If choice is 4
                System.out.println("It's Thursday");
            case 5 -> // If choice is 5
                System.out.println("It's Friday");
            case 6 -> // If choice is 6
                System.out.println("It's Saturday");
            case 7 -> // If choice is 7
                System.out.println("It's Sunday");
            default -> // If choice is anything other than 1-7
                System.out.println("Invalid Input");
        }

        // Close the scanner to avoid resource leak
        in.close();
    }
}
