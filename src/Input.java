import java.util.Scanner;

public class Input {
    public static void main( String [] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("What is your name? :");
        String name = scanner.nextLine();
        System.out.print("Hey "+name+"!!\nHow old are you? :");
        int age = scanner.nextInt();
        System.out.println("You are "+age+" years old.");
    }
}