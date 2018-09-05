import java.util.Scanner;

interface animal
{
void speak();
void eat();
}
class cat implements animal
{
public void speak()
{
System.out.println("cat meows");
}
public void eat()
{
System.out.println("cat eats fishes");
}
}
class dog implements animal
{
public void speak()
{
System.out.println("dog barks");
}
public void eat()
{
System.out.println("dog eats bones");
}
}
class que1
{
public static void main(String[] args)
{
dog d = new dog();
cat c = new cat();
d.speak();
d.eat();
c.speak();
c.eat();
}
}