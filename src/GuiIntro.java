import javax.swing.JOptionPane;

public class GuiIntro {
    public static void main(String [] args) {
        String name = JOptionPane.showInputDialog("Enter Your Name"); //Input
        JOptionPane.showMessageDialog(null,"Hello " +name); //Output
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age")); //Used parseInt to convert int to string
        JOptionPane.showMessageDialog(null,"Your age is "+age+" Years");
    }
}
