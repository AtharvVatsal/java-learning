// Inheritance is an OOP paradigm by which you can borrow/inherit features and methods from a parent/super class into a child/derived class
// Inheritance is the mechanism of deriving a new class from an existing class.
// Java has 4 types of inheritance
// 1. Multilevel Inheritance
// 2. Multiple Inheritance (via interfaces, as Java doesn't support it directly with classes)
// 3. Hierarchical Inheritance
// 4. Hybrid Inheritance (via interfaces)

// Base class (parent)
class Calculator {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }

    public double mul(int n1, int n2) {
        return (double) (n1 * n2);
    }

    public double div(int n1, int n2) {
        return (double) (n1 / n2);
    }

    // A method to demonstrate use of super in derived classes
    public void showInfo() {
        System.out.println("This is a basic calculator.");
    }
}

// Derived class (child) - Inherits from Calculator
class BetterCalculator extends Calculator {
    // Overriding the methods to accept double type parameters
    public double add(double n1, double n2) {
        return n1 + n2;
    }

    public double sub(double n1, double n2) {
        return n1 - n2;
    }

    public double mul(double n1, double n2) {
        return n1 * n2;
    }

    public double div(double n1, double n2) {
        if (n2 != 0) {
            return n1 / n2;
        } else {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
    }

    // Overriding showInfo method to include more details
    @Override
    public void showInfo() {
        super.showInfo(); // Calling the base class method
        System.out.println("This is an advanced calculator with double precision operations.");
    }
}

// Another derived class (child) demonstrating hierarchical inheritance
class ScientificCalculator extends BetterCalculator {
    public double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    public double sqrt(double number) {
        return Math.sqrt(number);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("This is a scientific calculator with additional math functions.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        BetterCalculator basicCalc = new BetterCalculator();
        System.out.println("Basic Calculator Operations:");
        basicCalc.showInfo();
        System.out.println("Addition: " + basicCalc.add(5.5, 6.0));
        System.out.println("Subtraction: " + basicCalc.sub(12, 10));
        System.out.println("Multiplication: " + basicCalc.mul(10, 20));
        System.out.println("Division: " + basicCalc.div(12.5, 7.8));

        System.out.println("\nScientific Calculator Operations:");
        ScientificCalculator sciCalc = new ScientificCalculator();
        sciCalc.showInfo();
        System.out.println("Power: " + sciCalc.power(2, 3));
        System.out.println("Square Root: " + sciCalc.sqrt(16));
    }
}
