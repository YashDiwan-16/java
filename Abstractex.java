abstract class Animal
{
abstract void show();
}

class Human extends Animal
{
@Override
void show()
{
System.out.println("Hello world");
}
}

public class Abstractex
{
public static void main(String args[])
{
Human h=new Human();
h.show();
}
}