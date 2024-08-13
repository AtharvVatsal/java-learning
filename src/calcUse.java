import classesForUse.advCalc;
import classesForUse.calc;

public class calcUse {
    public static void main(String[] args) {
        calc c1 = new calc();
        System.out.println("Calc 1 Add: " + c1.add(5, 7));
        advCalc c2 = new advCalc();
        System.out.println("Calc 2 Mul: " + c2.mul(5, 7));
    }
}
