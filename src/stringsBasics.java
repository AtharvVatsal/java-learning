
public class stringsBasics {

    public static void main(String[] args) {
        //Strings are not implicite data type but a class, therefore it can have methods
        //Strings are of two types: Mutable(Can be changed) and Immutable(Can't be changed)
        String first = new String("Atharv"); //Giving value via a constructor
        String last = "Vatsal";

        System.out.println("First Name :" + first);
        System.out.println("Last Name: " + last);

        System.out.println("Full name: " + first.concat(" " + last)); //Concating three strings
    }
}
