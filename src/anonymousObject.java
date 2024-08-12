class A {
    // Constructor of class A
    public A() {
        System.out.println("Object Created.");
    }

    // A method in class A
    public void display() {
        System.out.println("Display Method in class A");
    }
}

public class anonymousObject {
    public static void main(String[] args) {

        // Creating an anonymous object of class A
        new A(); // This creates an object but doesn't store it in a variable, making it
                 // anonymous

        // Using an anonymous object to call a method
        new A().display(); // Creates a new anonymous object and immediately calls the display() method
    }
}

/*
 * Explanation:
 * 
 * 1. **Anonymous Object Creation:**
 * - `new A();` creates an anonymous object of class `A`.
 * - Since this object isn't assigned to any reference variable, it can't be
 * reused later.
 * 
 * 2. **Method Call with Anonymous Object:**
 * - `new A().display();` creates a new object of class `A` and immediately
 * calls the `display()` method.
 * - This is useful when you want to perform an action with an object only once
 * and don't need to retain it.
 * 
 * 3. **Use Cases for Anonymous Objects:**
 * - **Method Invocation:** Anonymous objects are often used when you want to
 * call a method on an object without needing to keep the object around.
 * - **Single-use Initializations:** If you only need an object for a single
 * operation (like printing or performing a calculation), an anonymous object is
 * a good fit.
 * - **Memory Efficiency:** Since anonymous objects are not stored in a
 * reference variable, they can be garbage collected more easily, which can be
 * memory efficient in some cases.
 */
