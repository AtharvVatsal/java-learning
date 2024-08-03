public class castinAndConversion {
    public static void main (String args[]) {
        //A way to convert one data type to another (if possible)
        //Like integer to float or byte to interger and so on
        //One Thing to keep in mind is that valid conversion must be done so as to work
        int a = 10;
        double b = a;   //Implicit conversion
        System.out.println("A = "+a+"\tB = "+b);

        //By casting we can convert  one variable from one type to another (Explicit Conversion)

        float c = 15.67f;
        int d = (int)c;
        System.out.println("C = "+c+"\tD = "+d);
    }
}
