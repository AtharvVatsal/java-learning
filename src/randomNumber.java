import java.util.Random;

public class randomNumber {
    public static void main(String [] args) {
        Random random = new Random(); //Just like scanner we declare an instance of Random class here to start working with it
        //Pseudo random values not true random values
        int num = random.nextInt(6); //generated values from 0 to 5
        System.out.println("Random generated number is " +num);
    }
}
