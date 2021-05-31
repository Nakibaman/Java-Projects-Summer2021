
package summer2021lab3;

public class Task4 {
    public static void main(String[] args) {
        String fun1="The quick brown fox jumps over the lazy dog ";
        String fun2="The quick brown fox jumps over the lazy dog ";
        String fun3="The quick brown fox jumps over the lazy Dog ";
        String big_msg=fun1+fun2+fun3;
        String check_word="fox";
        String words[]=big_msg.split(" ");
        int count=0;
        for(String i:words)
        {
            if(i.equals(check_word))
                count++;
        }
        System.out.println("The Fox appears "+count+" times");
        
    }
}
