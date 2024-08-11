class Human {
    // Instance variables should be private to restrict direct access
    private String name; // Private variable, accessible only within this class
    private double height; // Private variable, accessible only within this class
    private int age; // Private variable, accessible only within this class

    // Public methods to access and modify the private variables
    public String nameGetter(String n) {
        name = n; // Set the private variable 'name' using a method
        return name; // Return the value of 'name'
    }

    public int getAge(int n) {
        age = n; // Set the private variable 'age' using a method
        return age; // Return the value of 'age'
    }

    public double getHeight(double h) {
        height = h; // Set the private variable 'height' using a method
        return height; // Return the value of 'height'
    }
}

public class encapsulation {

    public static void main(String[] args) {
        // Encapsulation binds data and restricts access to it
        Human sample1 = new Human();

        // Accessing private variables through public methods (encapsulation)
        String name = sample1.nameGetter("Sample 1"); // Set and get 'name'
        int age = sample1.getAge(11); // Set and get 'age'
        double height = sample1.getHeight(5.7); // Set and get 'height'

        // Displaying the details of the Human object
        System.out.println("Name: " + name + "  |\t" + "Age: " + age + "  |\t" + "Height: " + height + "  |");
    }
}

/*
 * Explanation:
 * 
 * 1. Encapsulation:
 * - Encapsulation is the practice of hiding the internal state of an object and
 * exposing access to it via public methods.
 * - In this example, the `Human` class encapsulates the `name`, `height`, and
 * `age` variables by making them private.
 * 
 * 2. Private Variables:
 * - The `name`, `height`, and `age` variables are private, meaning they cannot
 * be accessed directly outside the `Human` class.
 * - This ensures that these variables cannot be modified or accessed directly,
 * maintaining data integrity.
 * 
 * 3. Public Getter Methods:
 * - To access or modify the private variables, public methods (`nameGetter`,
 * `getAge`, `getHeight`) are provided.
 * - These methods allow controlled access to the private variables, ensuring
 * that any changes follow the logic defined in the methods.
 * 
 * 4. Encapsulation in Action:
 * - In the `main` method, an instance of the `Human` class (`sample1`) is
 * created.
 * - The private variables of `sample1` are accessed and modified using the
 * public getter methods.
 * - The `System.out.println` statement prints the values of `name`, `age`, and
 * `height`, demonstrating how encapsulation allows controlled access to the
 * object's data.
 * 
 * 5. Benefits of Encapsulation:
 * - Encapsulation helps in maintaining the integrity of data by preventing
 * unauthorized access or modification.
 * - It also promotes the modular design of code, making it easier to understand
 * and maintain.
 */
