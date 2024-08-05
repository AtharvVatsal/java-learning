
import java.util.Scanner;

public class whileLoop {

    public static void main(String[] args) {
        //Control flow statement that allows code to be executed repeatedly based on a given Boolean condition. The loop will continue to execute as long as the condition evaluates to true
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = in.nextInt();
        while (n > 2) {
            System.out.println(n);
            n--;
        }
        //while loop can be used to do infinite iterations aswell
        //while loops runs on boolean value ,i.e, true of given condition
        in.close();
    }
}
