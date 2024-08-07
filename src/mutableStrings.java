
public class mutableStrings {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        //StringBuffer is thread safe and StringBuilder is not
        sb.append("Atharv");
        String s = sb.toString();

        System.out.println("StringBuffer: " + sb);
        System.out.println("String Converted: " + s);
        System.out.println("Capacity of StringBuffer: " + sb.capacity());
        System.out.println("Length of StringBuffer: " + sb.length());
    }
}
