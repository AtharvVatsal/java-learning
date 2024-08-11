class TV {
    // Instance variables for the TV class
    private double size;
    private String company;
    private String resolution;

    // Default constructor
    public TV() {
        // This constructor is called when an object is created without any arguments
        System.out.println("\nIn default constructor");
    }

    // Parameterized constructor
    public TV(double s, String c, String r) {
        // This constructor initializes the instance variables with the provided values
        size = s;
        company = c;
        resolution = r;
        System.out.println("\nIn The Parameterized Constructor\n" + company + "\t\t" + size + "\t" + resolution);
    }
}

public class constructor {
    public static void main(String[] args) {
        // Creating an object using the default constructor
        TV t1 = new TV(); // Default constructor is invoked here

        // Creating another object using the parameterized constructor
        TV t2 = new TV(65, "Samsung", "UHD"); // Parameterized constructor is invoked here
    }
}

/*
 * Explanation:
 * 
 * 1. **Constructors:**
 * - Constructors are special methods used to initialize objects.
 * - They are automatically called when an object is created.
 * - They do not have a return type and must have the same name as the class.
 * 
 * 2. **Default Constructor:**
 * - The default constructor is invoked when an object is created without any
 * parameters.
 * - It usually sets default values to the object's attributes.
 * 
 * 3. **Parameterized Constructor:**
 * - The parameterized constructor allows you to pass specific values when
 * creating an object.
 * - It initializes the object's attributes with the provided values.
 * 
 * 4. **Object Creation:**
 * - When you create an object, the corresponding constructor is invoked.
 * - In the code, `t1` uses the default constructor, while `t2` uses the
 * parameterized constructor.
 * 
 * 5. **Output:**
 * - When the code runs, it first calls the default constructor for `t1`,
 * printing a message.
 * - Then, it calls the parameterized constructor for `t2`, which initializes
 * the attributes and prints them.
 */
