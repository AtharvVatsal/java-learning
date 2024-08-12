// Java program to demonstrate hierarchical inheritance/Multiple inheritance

// Base class (Parent class)
class Vehicle {
    // Instance variables for the Vehicle class
    String brand;
    int speed;

    // Constructor to initialize the Vehicle class
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to display information about the vehicle
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Derived class 1 (Child class) inheriting from Vehicle class
class Car extends Vehicle {
    // Instance variable specific to Car class
    int numberOfDoors;

    // Constructor to initialize the Car class
    public Car(String brand, int speed, int numberOfDoors) {
        // Calling the constructor of the base class (Vehicle)
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    // Method to display information about the car
    public void displayCarInfo() {
        // Calling the base class method to display vehicle info
        displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Derived class 2 (Child class) inheriting from Vehicle class
class Motorcycle extends Vehicle {
    // Instance variable specific to Motorcycle class
    boolean hasSidecar;

    // Constructor to initialize the Motorcycle class
    public Motorcycle(String brand, int speed, boolean hasSidecar) {
        // Calling the constructor of the base class (Vehicle)
        super(brand, speed);
        this.hasSidecar = hasSidecar;
    }

    // Method to display information about the motorcycle
    public void displayMotorcycleInfo() {
        // Calling the base class method to display vehicle info
        displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

// Main class to demonstrate hierarchical inheritance
public class hierarchicalInheritance {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", 180, 4);

        // Displaying information about the car
        System.out.println("Car Details:");
        myCar.displayCarInfo();

        // Creating an object of the Motorcycle class
        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", 120, false);

        // Displaying information about the motorcycle
        System.out.println("\nMotorcycle Details:");
        myMotorcycle.displayMotorcycleInfo();
    }
}

/*
 * Explanation:
 * 
 * 1. **Hierarchical Inheritance**:
 * - Hierarchical inheritance is a type of inheritance where multiple classes
 * inherit from a single base class.
 * - In this example, both the `Car` and `Motorcycle` classes inherit from the
 * `Vehicle` class.
 * 
 * 2. **Classes and Inheritance**:
 * - The `Vehicle` class is the base class or parent class that contains common
 * properties and methods for all vehicles.
 * - The `Car` class is a derived class that inherits from the `Vehicle` class
 * and adds a property specific to cars, such as `numberOfDoors`.
 * - The `Motorcycle` class is another derived class that inherits from the
 * `Vehicle` class and adds a property specific to motorcycles, such as
 * `hasSidecar`.
 * 
 * 3. **Constructors and `super` Keyword**:
 * - Each derived class constructor calls the constructor of its parent class
 * using the `super` keyword. This ensures that the parent class's properties
 * are initialized before the child class's properties.
 * 
 * 4. **Method Usage and Displaying Information**:
 * - The `displayInfo` method in the `Vehicle` class is called in the
 * `displayCarInfo` and `displayMotorcycleInfo` methods in the `Car` and
 * `Motorcycle` classes, respectively. This demonstrates how derived classes can
 * reuse and extend the functionality of their parent class.
 */
