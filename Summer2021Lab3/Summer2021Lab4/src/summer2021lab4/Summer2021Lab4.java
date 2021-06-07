
package summer2021lab4;

import javax.swing.JOptionPane;


public class Summer2021Lab4 {

    public static void main(String[] args) {
        int a[]={23,34,56,21,45};
        
        String msg="";
        for(int i:a)
            msg+=i+"\n";
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
