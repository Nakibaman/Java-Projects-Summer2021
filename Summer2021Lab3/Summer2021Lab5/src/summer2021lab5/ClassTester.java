
package summer2021lab5;


public class ClassTester {
    
    
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setRecord(101, "Md. Nabin Ahmed");
        s1.getRecord();
        CR cr1=new CR();
        cr1.setRecord(24, "Toukir Islam");
        cr1.setCrInfo("01711000000", "Alupotti, Rajshahi");
        cr1.getRecord();
        cr1.getCrInfo();
    }
}
