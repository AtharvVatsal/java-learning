public class Swap {
    public static void main(String [] args) {
        int x = 10;
        int y = 12;
        System.out.println("Number swapping\n");
        System.out.println("Initially x = "+x+" and\ny = "+y);
        x = x + y; // x = 10 + 12 -> 22
        y = x - y; // y = 22 - 12 -> 10
        x = x - y; // x = 22 - 10 -> 12
        System.out.println("After Swapping x = "+x+" and\ny = "+y);
        System.out.println("__________________________________________________________________________________\nname Swapping ->\n");
        String firstName = "Atharv";
        String lastName = "Vatsal";
        String temp;

        System.out.println("Name : "+firstName+" "+lastName);

        temp = firstName;
        firstName = lastName;
        lastName = temp;

        System.out.println("Reversed Name : "+firstName+" "+lastName);

    }
}
