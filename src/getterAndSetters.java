class Drinks {
    // Private variables to store the name and volume of the drink
    private String name = "";
    private int volume = 0;

    // Getter method to access the value of 'name'
    public String getName() {
        return name;
    }

    // Getter method to access the value of 'volume'
    public int getVolume() {
        return volume;
    }

    // Setter method to modify the value of 'name'
    public void setName(String name) {
        this.name = name; // 'this' keyword refers to the current object instance
    }

    // Setter method to modify the value of 'volume'
    public void setVolume(int volume) {
        this.volume = volume;
    }
}

public class getterAndSetters {
    public static void main(String[] args) {
        // Creating an instance of the Drinks class
        Drinks softDrinks = new Drinks();

        // Using setter methods to set the values of name and volume
        softDrinks.setName("Coca Cola");
        softDrinks.setVolume(330);

        // Using getter methods to retrieve and print the values of name and volume
        System.out.println(
                "||\tName: " + softDrinks.getName() + "\t\t||\t" + "Volume: " + softDrinks.getVolume() + "ml\t||");
    }
}

/*
 * Explanation:
 * 
 * 1. Getters and Setters:
 * - Getters and setters are methods used to retrieve (get) and update (set) the
 * values of private variables.
 * - They provide controlled access to the private fields of a class, which is
 * essential for maintaining data integrity and encapsulation.
 * 
 * 2. Private Variables:
 * - The `name` and `volume` variables in the `Drinks` class are declared as
 * private. This means they cannot be accessed directly from outside the class.
 * 
 * 3. Getter Methods:
 * - The `getName()` and `getVolume()` methods are used to retrieve the values
 * of the private variables `name` and `volume`.
 * - These methods allow external code to read the values of these variables
 * without modifying them directly.
 * 
 * 4. Setter Methods:
 * - The `setName(String name)` and `setVolume(int volume)` methods are used to
 * set the values of the private variables `name` and `volume`.
 * - The `this` keyword is used in the setter methods to refer to the current
 * instance of the class. It helps distinguish between the instance variables
 * and the parameters passed to the method.
 * 
 * 5. Encapsulation:
 * - By using getters and setters, the `Drinks` class encapsulates its data,
 * providing a controlled way to access and modify the private variables.
 * - This ensures that the internal state of the object is not exposed or
 * modified directly, protecting the integrity of the data.
 * 
 * 6. Main Method:
 * - In the `main` method, an instance of the `Drinks` class (softDrinks) is
 * created.
 * - The setter methods are used to set the name and volume of the drink.
 * - The getter methods are then used to retrieve and print these values.
 * 
 * 7. Output:
 * - The `System.out.println` statement prints the drink's name and volume,
 * demonstrating how getters and setters can be used to access and modify
 * private variables in a controlled manner.
 */
