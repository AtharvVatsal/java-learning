import java.util.Scanner;

public class mathematicsClass {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        double base, height, hypotenuse;
        System.out.println("Enter The Base ");
        base = in.nextDouble();
        System.out.println("Enter The Height ");
        height = in.nextDouble();

        hypotenuse = Math.sqrt((height*height) + (base * base));

        System.out.println("The Hypotenuse is " +hypotenuse+ "\n( " +base+ "," +height+ "," +hypotenuse+ " )");

        
        in.close();
    }
}
