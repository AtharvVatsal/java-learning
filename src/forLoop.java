
import java.util.Scanner;

public class forLoop {

    public static void main(String[] args) {
        //for loop is used to exiecute a block repeated number of times
        Scanner in = new Scanner(System.in);
        System.out.println("Enter last number: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(i + 1);
        }

    }
}
