
class Car {

    // Static variable: common to all instances of the class
    static String name;

    // Instance variables: unique to each object
    String model;
    int price;

    // Method to display the details of the car
    public void showDetails() {
        // Instance method can access both static and instance variables
        System.out.println(name + " | " + model + " | " + price);
    }

    // Static method: can only access static variables
    public static void display() {
        System.out.println();
        System.out.println("This is a static member");
        System.out.println(name);  // Static method accessing the static variable
        System.out.println();

        // Note: Static methods cannot access instance variables like 'model' or 'price' directly
        // Example: System.out.println(model); // This would cause an error
    }
}

public class staticMethod {

    public static void main(String[] args) {
        // Creating the first Car object
        Car c1 = new Car();
        Car.name = "Audi";  // Static variable is shared and set using the class name
        c1.model = "A4";  // Setting instance variable for the first object
        c1.price = 500000;  // Setting instance variable for the first object
        c1.showDetails();  // Calling an instance method
        Car.display();  // Calling the static method using the class name

        // Creating the second Car object
        Car c2 = new Car();
        c2.model = "Q7";  // Setting instance variable for the second object
        c2.price = 1000000;  // Setting instance variable for the second object
        c2.showDetails();  // Calling an instance method
        Car.display();  // Calling the static method using the class name
    }
}

/*
 * Explanation:
 * 
 * 1. Static Variable: `name` is shared among all instances of the `Car` class.
 *    - Changing `name` in one instance changes it for all other instances.
 * 
 * 2. Instance Variables: `model` and `price` are unique to each `Car` object.
 *    - Each object can have different values for these variables.
 * 
 * 3. Instance Method: `showDetails()` can access both static and instance variables.
 *    - It displays the car's details, including the common name and unique model and price.
 * 
 * 4. Static Method: `display()` can only access static variables.
 *    - It cannot access instance variables like `model` and `price` directly.
 *    - Static methods are useful for operations that are related to the class as a whole rather than any specific object.
 */
