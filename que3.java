import java.util.Scanner;
class que3
{
public static void main(String[] args)
{
String a,b;
Scanner s = new Scanner(System.in);
a = s.next();
b = s.next();
if( Integer.parseInt(a) > Integer.parseInt(b))
System.out.println("first number is greater");
else if( Integer.parseInt(a) < Integer.parseInt(b))
System.out.println("Second number is greater");
else 
System.out.println("both are equal");

}
}