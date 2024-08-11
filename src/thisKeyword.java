class Marks {
    // Private variables to store the marks and name of the subject
    private int marks;
    private String name;

    // Getter method to retrieve the value of 'marks'
    public int getMarks() {
        return marks;
    }

    // Getter method to retrieve the value of 'name'
    public String getName() {
        return name;
    }

    // Setter method to set the value of 'marks'
    public void setMarks(int marks) {
        this.marks = marks; // 'this.marks' refers to the instance variable, while 'marks' refers to the
                            // method parameter
    }

    // Setter method to set the value of 'name'
    public void setName(String name) {
        this.name = name; // 'this.name' refers to the instance variable, while 'name' refers to the
                          // method parameter
    }
}

public class thisKeyword {
    public static void main(String[] args) {
        // Create an instance of the Marks class
        Marks maths = new Marks();

        // Use setter methods to set the marks and name of the subject
        maths.setMarks(30);
        maths.setName("Mathematics");

        // Print the subject name and marks
        System.out.println("Subject\t\t\tMarks");
        System.out.println(maths.getName() + "\t\t" + maths.getMarks());
    }
}

/*
 * Explanation:
 * 
 * 1. The `this` Keyword:
 * - The `this` keyword in Java is used within an instance method or constructor
 * to refer to the current object.
 * - It is particularly useful in setter methods to avoid confusion between
 * instance variables and parameters when they have the same name.
 * - For example, in the `setMarks` method, `this.marks` refers to the instance
 * variable, while `marks` refers to the method parameter.
 * 
 * 2. Private Variables:
 * - The `marks` and `name` variables are declared as private, meaning they
 * cannot be accessed directly from outside the `Marks` class.
 * - This ensures encapsulation, protecting the data from unintended access and
 * modification.
 * 
 * 3. Getter Methods:
 * - The `getMarks()` and `getName()` methods are used to retrieve the values of
 * the private variables `marks` and `name`.
 * - These methods provide read-only access to these variables.
 * 
 * 4. Setter Methods:
 * - The `setMarks(int marks)` and `setName(String name)` methods are used to
 * set the values of the private variables `marks` and `name`.
 * - The `this` keyword is used to distinguish between the instance variables
 * and the method parameters when they share the same name.
 * 
 * 5. Main Method:
 * - In the `main` method, an instance of the `Marks` class (maths) is created.
 * - The setter methods are used to set the subject name and marks.
 * - The getter methods are then used to retrieve and print these values.
 * 
 * 6. Output:
 * - The `System.out.println` statement prints the subject's name and marks,
 * demonstrating the use of the `this` keyword to properly assign values within
 * the class.
 */