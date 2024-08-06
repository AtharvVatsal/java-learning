
import java.util.Scanner;

public class arrays {

    public static void main(String[] args) {
        // Stack: Last In First Out (LIFO)
        // Arrays are contiguous locations of memory that can be used to store multiple data of the same type

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = in.nextInt();

        // Create an array of size n
        int[] arr = new int[n];

        // Take input from the user and store it in the array
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element (#" + (i + 1) + "): ");
            arr[i] = in.nextInt();
        }

        // Print the elements of the array
        for (int i = 0; i < n; i++) {
            System.out.println("Element #" + (i + 1) + ": " + arr[i]);
        }

        in.close();
    }
}
