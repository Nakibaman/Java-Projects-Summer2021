
package summer2021lab3;

public class Task2 {
    public static void main(String[] args) {
        String msg="Hello World"; // 
        String msg2=new String("Hello World");
        char[] chars={'h','e','l','l','o',' '};
        String msg3=new String(chars);
        String big_msg=msg+msg2+msg3+12f;
        System.out.println(big_msg);
    }
}
