import java.util.*;
public class Shapes
{
public float area(float radius)
{
return 3.14f * radius * radius;
}
public float area(float length,float breadth)
{
return length * breadth;
}
public int area(int side)
{
return side*side;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Shapes cal=new Shapes();
System.out.println("1.Circle");
System.out.println("2.Rectangle");
System.out.println("3.Square");
System.out.println("4.EXIT");

while(true)
{
System.out.println("Enter the choice:");
int choice=sc.nextInt();
switch(choice)
{
case 1:
{
System.out.println("------CIRCLE-------");
System.out.println("Enter the radius:");
float radius=sc.nextFloat();
System.out.println("Area:"+cal.area(radius));
break;
}
case 2:
{
System.out.println("------RECTANGLE-------");
System.out.println("Enter the Length of rectangle:");
float length=sc.nextFloat();
System.out.println("Enter the Breadth of rectangle:");
float breadth=sc.nextFloat();
System.out.println("Area:"+cal.area(length,breadth));
break;
}
case 3:
{
System.out.println("------SQUARE-------");
System.out.println("Enter the Size of square:");
int side=sc.nextInt();
System.out.println("Area:"+cal.area(side));
break;
}
case 4:
{
System.out.println("------Exit-------");
System.exit(0);
}
default:
System.out.println("Invalid choice");
}
}
}
}
