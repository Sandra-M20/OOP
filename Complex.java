//complex number addition

import java.util.Scanner;
public class Complex
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the real part of first number:");
  int real1=sc.nextInt();
  System.out.println("enter the imaginary part of first number:");
  int img1=sc.nextInt();
  System.out.println("the first complex number is:"+real1+"+"+img1+"i");
  System.out.println("enter the real part of second number:");
  int real2=sc.nextInt();
  System.out.println("enter the img part of second number:");
  int img2=sc.nextInt();
  System.out.println("the second complex number is:"+real2+"+"+img2+"i");
  int realsum=real1+real2;
  int imgsum=img1+img2;
  System.out.print("sum of complex number is:"+realsum+"+"+imgsum+"i");
  System.out.println();
  }
  }
