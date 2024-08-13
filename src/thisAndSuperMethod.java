// Sample1 is a base/parent class
class Sample1 {
    // Default constructor of Sample1
    public Sample1() {
        System.out.println("In Sample1 Class");
    }

    // Parameterized constructor of Sample1
    public Sample1(int n) {
        System.out.println("In Sample1 with Value " + n);
    }

    // Method to be inherited by subclasses
    public void show() {
        System.out.println("Show method in Sample1");
    }
}

// Sample2 is a derived/child class that extends Sample1
class Sample2 extends Sample1 {
    // Default constructor of Sample2
    public Sample2() {
        // super(); is implicitly called here if not specified
        System.out.println("In Sample2 Class");
    }

    // Parameterized constructor of Sample2
    public Sample2(int n) {
        super(n); // Calls the parameterized constructor of Sample1
        System.out.println("In Sample2 with Value " + n);
    }

    // Overriding the show method from Sample1
    @Override
    public void show() {
        super.show(); // Calls the show method of the parent class
        System.out.println("Show method in Sample2");
    }
}

public class thisAndSuperMethod {
    public static void main(String[] args) {
        // Creating an instance of Sample2 using the default constructor
        Sample2 obj1 = new Sample2();
        obj1.show(); // Calls the overridden show method in Sample2

        System.out.println(); // Adding a line break for clarity

        // Creating an instance of Sample2 using the parameterized constructor
        Sample2 obj2 = new Sample2(10);
        obj2.show(); // Again calls the overridden show method in Sample2
    }
}

/*
 * Explanation:
 * 
 * 1. The `super` Keyword:
 * - The `super` keyword in Java is used to refer to the superclass (parent
 * class) of the current object.
 * - It can be used to call the parent class's constructor and methods.
 * - In this code, `super(n);` calls the parameterized constructor of the
 * `Sample1` class from within the `Sample2` class.
 * - `super.show();` calls the `show` method from the parent class `Sample1`
 * before executing the additional logic in the `Sample2` class.
 * 
 * 2. The `this` Keyword:
 * - The `this` keyword refers to the current instance of the class.
 * - It is used to resolve ambiguity between instance variables and parameters,
 * or to call another constructor in the same class.
 * - Although `this` is not explicitly used in this code, it is important in
 * similar scenarios where instance variables and parameters have the same
 * names.
 * 
 * 3. The `Object` Class:
 * - Every class in Java implicitly extends the `Object` class, which is the
 * root of the class hierarchy.
 * - This means that `Sample1` and `Sample2` also have access to methods from
 * the `Object` class, such as `toString()`, `equals()`, and `hashCode()`.
 * 
 * 4. How the Code Works:
 * - When `new Sample2()` is called, it first invokes the default constructor of
 * `Sample1` (the parent class), then the default constructor of `Sample2`.
 * - When `new Sample2(10)` is called, it invokes the parameterized constructor
 * of `Sample1` via `super(n)` and then proceeds to execute the `Sample2`
 * constructor.
 * - The `show()` method is overridden in `Sample2`, but the original `show()`
 * method in `Sample1` can still be called using `super.show()`.
 */
