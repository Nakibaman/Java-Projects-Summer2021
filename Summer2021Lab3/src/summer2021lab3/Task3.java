
package summer2021lab3;

import javax.swing.JOptionPane;

public class Task3 {
    public static void main(String[] args) {
        String str1=JOptionPane.showInputDialog("Enter 1st String -");
        String str2=JOptionPane.showInputDialog("Enter 2nd String -");
        String big_msg=str1+" "+str2;
        JOptionPane.showMessageDialog(null, big_msg);
    }
}
