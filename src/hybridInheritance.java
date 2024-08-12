// Java program to demonstrate hybrid inheritance using classes and interfaces

// Interface 1 (First parent interface)
interface Vehicle {
    void start(); // Abstract method to start the vehicle

    void stop(); // Abstract method to stop the vehicle
}

// Interface 2 (Second parent interface)
interface Electric {
    void charge(); // Abstract method to charge the vehicle
}

// Base class (Parent class)
class Car implements Vehicle {
    String brand;
    int speed;

    // Constructor to initialize the Car class
    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Implementing methods from the Vehicle interface
    public void start() {
        System.out.println(brand + " car is starting with a speed of " + speed + " km/h.");
    }

    public void stop() {
        System.out.println(brand + " car has stopped.");
    }

    // Method specific to Car class
    public void accelerate() {
        System.out.println(brand + " car is accelerating.");
    }
}

// Derived class (Child class) that inherits from Car and implements Electric
// interface
class ElectricCar extends Car implements Electric {
    int batteryLevel;

    // Constructor to initialize the ElectricCar class
    public ElectricCar(String brand, int speed, int batteryLevel) {
        super(brand, speed); // Calling the constructor of the Car class
        this.batteryLevel = batteryLevel;
    }

    // Implementing method from the Electric interface
    public void charge() {
        System.out.println(brand + " electric car is charging. Battery level: " + batteryLevel + "%");
    }

    // Overriding the start method from the Car class
    @Override
    public void start() {
        System.out.println(brand + " electric car is starting silently with a speed of " + speed + " km/h.");
    }
}

// Another derived class (Child class) that inherits from Car
class HybridCar extends Car implements Electric {
    int fuelLevel;

    // Constructor to initialize the HybridCar class
    public HybridCar(String brand, int speed, int fuelLevel) {
        super(brand, speed); // Calling the constructor of the Car class
        this.fuelLevel = fuelLevel;
    }

    // Implementing method from the Electric interface
    public void charge() {
        System.out.println(brand + " hybrid car is charging. Fuel level: " + fuelLevel + "%");
    }

    // Overriding the start method from the Car class
    @Override
    public void start() {
        System.out.println(brand + " hybrid car is starting with a mix of electric and fuel power at a speed of "
                + speed + " km/h.");
    }
}

// Main class to demonstrate hybrid inheritance
public class hybridInheritance {
    public static void main(String[] args) {
        // Creating an object of the ElectricCar class
        ElectricCar tesla = new ElectricCar("Tesla", 150, 80);
        System.out.println("Electric Car Details:");
        tesla.start();
        tesla.charge();
        tesla.accelerate();
        tesla.stop();

        // Creating an object of the HybridCar class
        HybridCar prius = new HybridCar("Toyota Prius", 120, 50);
        System.out.println("\nHybrid Car Details:");
        prius.start();
        prius.charge();
        prius.accelerate();
        prius.stop();
    }
}

/*
 * Explanation:
 * 
 * 1. **Hybrid Inheritance**:
 * - Hybrid inheritance is a combination of two or more types of inheritance
 * (like single, multiple, and multilevel) to form a hierarchy.
 * - In Java, hybrid inheritance can be achieved using a mix of classes and
 * interfaces since Java doesn't support multiple inheritance with classes
 * directly.
 * 
 * 2. **Classes and Interfaces**:
 * - The `Vehicle` and `Electric` interfaces define the basic methods that
 * classes implementing them should have.
 * - The `Car` class implements the `Vehicle` interface, making it a concrete
 * class that can be instantiated.
 * - The `ElectricCar` and `HybridCar` classes extend the `Car` class and
 * implement the `Electric` interface, making them specialized versions of `Car`
 * with additional features.
 * 
 * 3. **Constructor and `super` Keyword**:
 * - The `super` keyword is used in the constructors of `ElectricCar` and
 * `HybridCar` classes to call the constructor of the `Car` class. This ensures
 * proper initialization of inherited properties.
 * 
 * 4. **Method Usage and Overriding**:
 * - Both `ElectricCar` and `HybridCar` classes override the `start` method from
 * the `Car` class to provide their specific implementations.
 * - The `charge` method, which is specific to electric vehicles, is implemented
 * in both `ElectricCar` and `HybridCar`.
 * 
 * 5. **Object Creation**:
 * - In the `main` method, two objects are created: one for `ElectricCar` and
 * one for `HybridCar`.
 * - Each object demonstrates how hybrid inheritance allows the reuse and
 * extension of functionality across a hierarchy of classes and interfaces.
 */
