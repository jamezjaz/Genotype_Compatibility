import javax.swing.*;

public class Genotype {
    public static  void main(String[] args) {
        JOptionPane.showMessageDialog(null, "★★★GENOTYPE COMPATIBILITY★★★" + "\n" + "This is a genotype compatibility program. You'll get to understand whether or not you're compatible with your partner(s)." + "\n" + "Enjoy!");

        String name = JOptionPane.showInputDialog("Enter your name").toUpperCase();
        JOptionPane.showMessageDialog(null, "Hello " + name + "!" + "\n" + "You're welcome");

        String partnerName = JOptionPane.showInputDialog("Enter your partner's name").toUpperCase();

        String genoType = JOptionPane.showInputDialog("What's your genotype?").toUpperCase();
        String partnerGenoType = JOptionPane.showInputDialog("What's your partner's genotype?").toUpperCase();
    }
}
