
package summer2021lab4;

import javax.swing.JOptionPane;

public class Amnitei2 {
    public static void main(String[] args) {
        String reply=JOptionPane.showInputDialog("Enter array size -");
        int array_size=Integer.parseInt(reply);
        int array[]=new int[100];
        for(int i=0;i<array_size;i++)
        {
            reply=JOptionPane.showInputDialog("Enter element on array["+i+"] -");
            array[i]=Integer.parseInt(reply);
        }
        int max=array[0];
        for(int i=1;i<array_size;i++)
        {
            if(array[i]>max)
                max=array[i];
        }
        JOptionPane.showMessageDialog(null, "The max value is - "+max);    
    }
}
