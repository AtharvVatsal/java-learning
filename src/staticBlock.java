
class Tea {

    // Static variable: shared by all instances of the class
    static String company;

    // Instance variables: unique to each object
    int weight;
    int price;

    // Static block: executed only once when the class is loaded
    static {
        company = "Tata Gold";  // Initialize the static variable
        System.out.println("\nRight Now In Static Block\n");  // Indicate when the static block is running
    }

    // Parameterized constructor: used to initialize instance variables
    public Tea(int w, int p) {
        weight = w;  // Set the weight of the Tea object
        price = p;   // Set the price of the Tea object
        System.out.println("Company: " + company + "  |  " + "Price: " + price + "  |  " + "Weight: " + weight);
        System.out.println("\nRight Now In Constructor\n");  // Indicate when the constructor is running
    }
}

public class staticBlock {

    public static void main(String[] args) {
        // Creating the first Tea object
        Tea t1 = new Tea(20, 2000);  // Initializes weight and price with 20 and 2000 respectively

        // Creating the second Tea object
        Tea t2 = new Tea(10, 1000);  // Initializes weight and price with 10 and 1000 respectively
    }
}

/*
 * Explanation:
 * 
 * 1. Static Variable: `company` is a class variable that is shared among all instances of the `Tea` class.
 *    - It is initialized in the static block.
 * 
 * 2. Static Block: 
 *    - This block is executed only once when the class is loaded into memory, before any objects are created.
 *    - It is used to initialize static variables or perform one-time setup.
 *    - In this code, it prints a message to indicate when it is being executed.
 * 
 * 3. Parameterized Constructor: 
 *    - The constructor is called each time a new object of the `Tea` class is created.
 *    - It initializes the instance variables (`weight` and `price`) and prints the details of the object.
 *    - A message is also printed to indicate when the constructor is running.
 * 
 * 4. Object Creation:
 *    - When `Tea` objects `t1` and `t2` are created in the `main` method, the constructor initializes their instance variables.
 *    - The static block runs only once before the first object is created, and the constructor runs for each object.
 */