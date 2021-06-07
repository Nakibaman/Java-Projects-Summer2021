
package summer2021lab4;


public class TwoDArray {
    public static void main(String[] args) {
        int table[][]={{1,2,3},{4,5,6},{7,8,9}};
        int k=1;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
    }
}
