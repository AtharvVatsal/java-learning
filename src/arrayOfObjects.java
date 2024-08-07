
class Rectangle {

    Rectangle() {
    }
    int l;
    int b;

    public int area(int l, int b) {
        return l * b;
    }
}

public class arrayOfObjects {

    public static void main(String[] args) {
        Rectangle rectangles[] = new Rectangle[3];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle();

        for (int i = 0; i < 3; i++) {
            System.out.println("Area Rectangle #" + (i + 1) + ": " + rectangles[i].area(4, 14));
        }
    }

}
