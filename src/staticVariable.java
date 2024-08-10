
class Phone {

    // Static variable: common to all instances of the class
    static String company;

    // Instance variables: unique to each object
    int price;
    int type;

    // Method to display the details of the phone
    public void showDetails() {
        System.out.println(company + " | " + price + " | " + type + "g |");
    }
}

public class staticVariable {

    public static void main(String[] args) {
        // Static variables are used to make a common variable that is shared among all objects

        // Creating the first Phone object
        Phone a54 = new Phone();
        Phone.company = "Samsung";  // Static variable is set using the class name
        a54.price = 45000;  // Setting instance variable for the first object
        a54.type = 5;  // Setting instance variable for the first object

        // Creating the second Phone object
        Phone m30s = new Phone();
        m30s.price = 13000;  // Setting instance variable for the second object
        m30s.type = 4;  // Setting instance variable for the second object

        // Displaying details of both objects
        a54.showDetails();
        m30s.showDetails();
    }
}

/*
 * Explanation:
 * 
 * 1. Static Variable (`company`):
 *    - A static variable is common to all instances of the class. It is shared among all objects.
 *    - In this example, the `company` variable is static, meaning all `Phone` objects share the same `company` value.
 *    - The value of `company` is set using `Phone.company = "Samsung";` and is accessible to all instances.
 * 
 * 2. Instance Variables (`price` and `type`):
 *    - Instance variables are unique to each object.
 *    - Each `Phone` object has its own `price` and `type`, which are set separately for `a54` and `m30s`.
 * 
 * 3. Static Variable Access:
 *    - Static variables are typically accessed using the class name (e.g., `Phone.company`), rather than through an object.
 *    - This emphasizes that the variable is shared among all instances.
 * 
 * 4. Output:
 *    - The `showDetails()` method prints the static `company` name along with the individual `price` and `type` for each phone.
 *    - Since `company` is static, it displays the same value ("Samsung") for both phones.
 */
