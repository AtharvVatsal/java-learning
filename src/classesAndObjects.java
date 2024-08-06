
import java.util.Scanner;

// A class named Calc that defines a simple calculator
class Calc {

    // Method for addition
    public int add(int n, int m) {
        return n + m;
    }

    // Method for subtraction
    public int sub(int n, int m) {
        return n - m;
    }

    // Method for multiplication
    public double mul(double n, double m) {
        return n * m;
    }

    // Method for division
    public double div(double n, double m) {
        return n / m;
    }

    // Method for modulus
    public int mod(int n, int m) {
        return n % m;
    }
}

public class classesAndObjects {

    public static void main(String[] args) {

        Calc c = new Calc();

        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.print("1 for addition\n2 for subtraction\n3 for multiplication\n4 for division\n5 for modulo\n6 QUIT\nEnter your choice: ");
            int choice = in.nextInt();

            if (choice == 6) {
                System.out.println("Exiting the program.");
                break;
            }

            System.out.println("Enter 1st Number");
            int num1 = in.nextInt();
            System.out.println("Enter 2nd Number");
            int num2 = in.nextInt();
            System.out.println("");

            switch (choice) {
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + c.add(num1, num2)+"\n");
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + c.sub(num1, num2)+"\n");
                    break;
                case 3:
                    System.out.println(num1 + " * " + num2 + " = " + c.mul(num1, num2)+"\n");
                    break;
                case 4:
                    System.out.println(num1 + " / " + num2 + " = " + c.div((double) num1, (double) num2)+"\n");
                    break;
                case 5:
                    System.out.println(num1 + " % " + num2 + " = " + c.mod(num1, num2)+"\n");
                    break;
                default:
                    System.out.println("Wrong Input");
                    break;
            }
        }
    }
}

/*
 * Explanation of Classes, Objects, and OOP:
 * 
 * Classes:
 * - A class is a blueprint for creating objects. It defines a datatype by bundling data (attributes) and methods (functions) that work on the data into one single unit.
 * - Example: The 'Calc' class in this program is a blueprint for creating a calculator object with methods for addition, subtraction, multiplication, division, and modulus operations.
 * 
 * Objects:
 * - An object is an instance of a class. When a class is defined, no memory is allocated until an object of that class is created.
 * - Example: 'Calc c = new Calc();' creates an object 'c' of the 'Calc' class. This object can now use the methods defined in the 'Calc' class.
 * 
 * Object-Oriented Programming (OOP) Concepts:
 * - Encapsulation: Bundling the data (attributes) and methods (functions) that operate on the data into a single unit or class, and restricting access to some of the object's components.
 * - Inheritance: Mechanism where one class can inherit the fields and methods of another class. Promotes code reuse.
 * - Polymorphism: Allows objects to be treated as instances of their parent class rather than their actual class. It enables a single interface to represent different underlying forms (data types).
 * - Abstraction: Hiding complex implementation details and showing only the necessary features of an object. It simplifies interaction with the object.
 * 
 * Uses:
 * - Promotes code reuse through inheritance.
 * - Improves code maintainability and readability.
 * - Encapsulation provides data protection and prevents unintended data modification.
 * - Polymorphism and abstraction allow for flexible and scalable code design.
 */
