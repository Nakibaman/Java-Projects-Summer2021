
package summer2021lab5;

public class Student {
    int id;
    String name;
    void setRecord(int a,String b)
    {
        id=a;
        name=b;
    }
    void getRecord()
    {
        System.out.println("Id is :"+id+" Name is :"+name);
    }
}
