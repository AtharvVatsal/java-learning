// Single Inheritance: 
// In single inheritance, a class (child class) inherits properties and behaviors from another class (parent class). 
// This helps in reusability of code and establishes a relationship between the parent and child classes.

class Animal {
    // Parent class or Superclass
    String name;
    int age;

    // Method to display basic information about the animal
    public void displayInfo() {
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Age: " + age + " years");
    }

    // Method to make the animal sound
    public void sound() {
        System.out.println(name + " makes a sound.");
    }
}

// Dog class inherits from Animal class
class Dog extends Animal {
    // Child class or Subclass

    String breed;

    // Method to display breed-specific information
    public void displayBreed() {
        System.out.println("Breed: " + breed);
    }

    // Overriding the sound method of the parent class
    @Override
    public void sound() {
        System.out.println(name + " barks!");
    }
}

public class singleInheritance {
    public static void main(String[] args) {
        // Creating an object of the Dog class
        Dog myDog = new Dog();

        // Setting properties for the Dog object
        myDog.name = "Buddy";
        myDog.age = 3;
        myDog.breed = "Golden Retriever";

        // Using methods inherited from the Animal class
        myDog.displayInfo(); // Displaying the name and age of the dog

        // Using the method specific to the Dog class
        myDog.displayBreed(); // Displaying the breed of the dog

        // Using the overridden method in the Dog class
        myDog.sound(); // Displaying the sound the dog makes
    }
}
