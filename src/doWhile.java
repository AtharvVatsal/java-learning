
public class doWhile {

    public static void main(String[] args) {
        int n = 5;
//The do-while loop guarantees the code block executes at least once, as the condition is checked after the block is executed, unlike the while loop which checks the condition before.
        do {
            System.out.println("Hello " + n);
            n--;
        } while (n > 0);
        System.out.println("Bye " + n);

    }
}
