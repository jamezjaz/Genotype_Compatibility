import javax.swing.*;

public class Genotype {
    public static  void main(String[] args) {
        JOptionPane.showMessageDialog(null, "★★★GENOTYPE COMPATIBILITY★★★" + "\n" + "This is a genotype compatibility program. You'll get to understand whether or not you're compatible with your partner(s)." + "\n" + "Enjoy!");

        String name = JOptionPane.showInputDialog("Enter your name").toUpperCase();
        JOptionPane.showMessageDialog(null, "Hello " + name + "!" + "\n" + "You're welcome");

        String partnerName = JOptionPane.showInputDialog("Enter your partner's name").toUpperCase();

        String genoType = JOptionPane.showInputDialog("What's your genotype?").toUpperCase();
        String partnerGenoType = JOptionPane.showInputDialog("What's your partner's genotype?").toUpperCase();
        if (genoType.equals("AA") && partnerGenoType.equals("AA")) {
            JOptionPane.showMessageDialog(null, "You're very compatible! (Recommended)");
        } else if (genoType.equals("AA") && partnerGenoType.equals("AS")) {
            JOptionPane.showMessageDialog(null, "You're compatible! \nFor every four children, you're likely going to have 2 AAs and 2 carriers.\n" + name + ", go ahead and marry " + partnerName + " :)");
        } else if (genoType.equals("AS") && partnerGenoType.equals("AA")) {
            JOptionPane.showMessageDialog(null, "You're compatible! \nFor every four children, you're likely going to have 2 AAs and 2 carriers.\n" + name + ", go ahead and marry " + partnerName + " :)");
        } else if (genoType.equals("AS") && partnerGenoType.equals("AS")) {
            JOptionPane.showMessageDialog(null, "For every four children, you're likely going to have one AA, two carriers, and one sickler.\n" + name + ", you can marry " + partnerName + " but this is not recommended ):");
        } else if (genoType.equals("AA") && partnerGenoType.equals("SS")) {
            JOptionPane.showMessageDialog(null, "Dear " + name + ",\n" + "You're not compatible but you can marry " + partnerName + ". All your first four children are most likely going to be carriers.");
        } else if (genoType.equals("SS") && partnerGenoType.equals("AA")) {
            JOptionPane.showMessageDialog(null, "Dear " + name + ",\n" + "You're not compatible but you can marry " + partnerName + ". All your first four children are most likely going to be carriers.");
        } else if (genoType.equals("AS") && partnerGenoType.equals("SS")) {
            JOptionPane.showMessageDialog(null, "50% of your first four children are likely going to be carriers and the remaining 50% would be sicklers.\nDear " + name + ",\nPlease, do not marry " + partnerName + ".");
        } else if (genoType.equals("SS") && partnerGenoType.equals("AS")) {
            JOptionPane.showMessageDialog(null, "50% of your first four children are likely going to be carriers and the remaining 50% would be sicklers.\nDear " + name + ",\nPlease, do not marry " + partnerName + ".");
        } else if (genoType.equals("SS") && partnerGenoType.equals("SS")) {
            JOptionPane.showMessageDialog(null, "Halt!\nPlease, do not proceed with your plans!\n\nDear " + name + ",\nI'm sorry, but you cannot marry " + partnerName + ".\nThis cannot work because all your children are most likely going to be sicklers!\nI'm pretty sure this isn't something you'd like venture into.");
        } else {
            JOptionPane.showMessageDialog(null, "Dear " + name + ",\nPlease enter a valid genotype.\n\nValid genotypes: AA, AS, SS.\nThank you!");
        }
    }
}
