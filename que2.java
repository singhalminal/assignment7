import java.util.Scanner;

abstract class animal
{
String color,breed,name;
animal(String breed, String name)
{
this.breed = breed;
this.name = name; 
}
abstract void eat(); 
public void speak()
{
System.out.println(name  + " Speak " + "," + " breed = " +  breed);
}
}
class dog extends animal
{
dog(String breed, String name)
{
super(breed,name);
}
public void eat()
{
System.out.println(name+" eats ");
}
}
class cat extends animal
{
cat(String breed, String name)
{
super(breed,name);
}
public void eat()
{
System.out.println(name  + " eats");
}
}
class que2
{
public static void main(String args[])
{
dog d = new dog("German Shephard", "Mylo");
cat c = new cat("American Curl","Missy");
d.speak();
d.eat();
c.speak();
c.eat();
}
}