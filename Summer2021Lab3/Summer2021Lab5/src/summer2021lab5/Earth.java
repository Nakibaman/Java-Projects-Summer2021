
package summer2021lab5;

public class Earth {
    public static void main(String args[])
    {
        System.out.println("Boring angel -");
        Alive angel=new Alive();
        angel.breath();
        System.out.println("A smart plant can -");
        Plant tulip=new Plant();
        tulip.breath();
        tulip.canGrowFood();
        System.out.println("A smart human can -");
        Animal human=new Animal();
        human.breath();
        human.canMove();
    }
}
