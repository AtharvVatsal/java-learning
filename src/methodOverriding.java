// Method overriding is a feature in Java that allows a subclass (child class) to provide a specific implementation of a method that is already defined in its superclass (parent class).
// The method in the subclass must have the same name, return type, and parameters as the method in the superclass.

class Laptops {
    // Method to be overridden in the subclass
    public void show() {
        System.out.println("Laptops");
    }

    // Another method that will be overridden in the subclass
    public void random() {
        System.out.println("In Random Method of Laptop Class");
    }
}

class Dell extends Laptops {
    // Method overriding: The show method in Dell class overrides the show method in
    // Laptops class
    @Override
    public void show() {
        System.out.println("Dell Laptops");
    }

    // Method overriding: The random method in Dell class overrides the random
    // method in Laptops class
    @Override
    public void random() {
        System.out.println("In Random Method of Dell Class");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        // Creating an object of the Laptops class
        Laptops laps = new Laptops();
        laps.show(); // Calls the show method in Laptops class (Not Overridden)
        laps.random(); // Calls the random method in Laptops class (Not Overridden)
        System.out.println();

        // Creating an object of the Dell class
        Dell g15 = new Dell();
        g15.show(); // Calls the overridden show method in Dell class
        g15.random(); // Calls the overridden random method in Dell class
    }
}

/*
 * Explanation:
 * 
 * 1. Method Overriding:
 * - Method overriding occurs when a subclass (child class) provides a specific
 * implementation for a method that is already defined in its superclass (parent
 * class).
 * - The overridden method in the subclass must have the same name, return type,
 * and parameters as the method in the superclass.
 * - In this code, the `Dell` class overrides the `show` and `random` methods of
 * the `Laptops` class.
 * 
 * 2. `@Override` Annotation:
 * - The `@Override` annotation is used to indicate that a method is being
 * overridden. It is not mandatory but is good practice as it helps to avoid
 * errors.
 * 
 * 3. Method Calls:
 * - When an object of the `Laptops` class is created (`laps`), the methods
 * `show()` and `random()` of the `Laptops` class are called.
 * - When an object of the `Dell` class is created (`g15`), the overridden
 * methods `show()` and `random()` of the `Dell` class are called instead of the
 * ones in the `Laptops` class.
 * 
 * 4. Polymorphism:
 * - Method overriding is an example of runtime polymorphism (dynamic method
 * dispatch) in Java, where the method to be called is determined at runtime
 * based on the object type.
 */