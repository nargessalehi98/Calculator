import javax.swing.*;

/**
 * this class run calculator
 * @author  Narges Salehi
 */
public class Main {

    public static void main(String[] args) {

        for(UIManager.LookAndFeelInfo info :UIManager.getInstalledLookAndFeels())
            System.out.println(info.getClassName());
        //choosing UI
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Motif".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
         // If Nimbus is not available, you can set the GUI to another look and feel.
        }
        //creat a new calculator
        Calculator calculator = new Calculator();
    }
}
