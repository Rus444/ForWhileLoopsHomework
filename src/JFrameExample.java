import javax.swing.*;

public class JFrameExample {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Title");
        String name=JOptionPane.showInputDialog(frame,"Please enter name");
        int num=Integer.parseInt(JOptionPane.showInputDialog(frame,"Please enter whole number"));
        System.out.println("Name :"+name);
        System.out.println("Number :"+num);
    }
}
