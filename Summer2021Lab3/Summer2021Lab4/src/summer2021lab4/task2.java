
package summer2021lab4;


public class task2 {
    public static void main(String[] args) {
        int a[]={23,34,56,21,45,11,80};
        System.out.println("Length of a is "+a.length);
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        System.out.println("Max is "+max);
    }
}
