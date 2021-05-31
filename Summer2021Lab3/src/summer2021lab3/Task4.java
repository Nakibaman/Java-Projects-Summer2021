
package summer2021lab3;

public class Task4 {
    public static void main(String[] args) {
        String fun1="The quick brown fox jumps over the lazy dog ";
        String fun2="The quick brown fox jumps over the lazy dog ";
        String fun3="The quick brown fox jumps over the lazy Dog ";
        String big_msg=fun1+fun2+fun3;
        int words=0;
        for(int i=0;i<big_msg.length();i++)
        {
            if(big_msg.charAt(i)==' ')
               words++;
        }
        System.out.println("The string has "+words+" words");
        
    }
}
