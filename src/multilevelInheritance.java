// Java program to demonstrate multilevel inheritance

// Base class (Parent class)
class Animal {
    // Instance variables of the Animal class
    String name;
    int age;

    // Constructor to initialize the Animal class
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information about the animal
    public void displayInfo() {
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Age: " + age);
    }
}

// Derived class (Child class) inheriting from Animal class
class Mammal extends Animal {
    // Instance variable specific to Mammal class
    boolean hasFur;

    // Constructor to initialize the Mammal class
    public Mammal(String name, int age, boolean hasFur) {
        // Calling the constructor of the base class (Animal)
        super(name, age);
        this.hasFur = hasFur;
    }

    // Method to display information about the mammal
    public void displayMammalInfo() {
        // Calling the base class method to display animal info
        displayInfo();
        System.out.println("Has Fur: " + (hasFur ? "Yes" : "No"));
    }
}

// Derived class (Grandchild class) inheriting from Mammal class
class Dog extends Mammal {
    // Instance variable specific to Dog class
    String breed;

    // Constructor to initialize the Dog class
    public Dog(String name, int age, boolean hasFur, String breed) {
        // Calling the constructor of the base class (Mammal)
        super(name, age, hasFur);
        this.breed = breed;
    }

    // Method to display information about the dog
    public void displayDogInfo() {
        // Calling the base class method to display mammal info
        displayMammalInfo();
        System.out.println("Breed: " + breed);
    }
}

// Main class to demonstrate multilevel inheritance
public class multilevelInheritance {
    public static void main(String[] args) {
        // Creating an object of the Dog class
        Dog myDog = new Dog("Buddy", 5, true, "Golden Retriever");

        // Displaying information about the dog
        myDog.displayDogInfo();
    }
}

/*
 * Explanation:
 * 
 * 1. **Multilevel Inheritance**:
 * - Multilevel inheritance is a type of inheritance where a class is derived
 * from a class that is also derived from another class.
 * - In this example, the `Dog` class is derived from the `Mammal` class, which
 * in turn is derived from the `Animal` class.
 * 
 * 2. **Classes and Inheritance**:
 * - The `Animal` class is the base class or parent class that contains common
 * properties and methods for all animals.
 * - The `Mammal` class is a derived class that inherits from the `Animal`
 * class. It adds a property specific to mammals, such as `hasFur`.
 * - The `Dog` class is another derived class that inherits from the `Mammal`
 * class. It adds a property specific to dogs, such as `breed`.
 * 
 * 3. **Constructors and `super` Keyword**:
 * - Each derived class constructor calls the constructor of its parent class
 * using the `super` keyword. This ensures that the parent class's properties
 * are initialized before the child class's properties.
 * 
 * 4. **Method Overriding and Displaying Information**:
 * - The `displayInfo` method in the `Animal` class is called in the
 * `displayMammalInfo` method in the `Mammal` class, which is then called in the
 * `displayDogInfo` method in the `Dog` class. This demonstrates how derived
 * classes can reuse and extend the functionality of their parent classes.
 */