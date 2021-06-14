
package summer2021lab5;


public class CR extends Student{
    String cell_no;
    String contact_address;
    
    void setCrInfo(String a,String b)
    {
        cell_no=a;
        contact_address=b;
    }
    void getCrInfo()
    {
        System.out.println("His/Her cell no. is :"+cell_no+" Contact address :"+contact_address);
    }
}
