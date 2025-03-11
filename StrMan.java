import java.util.Scanner;

class StrMan{
    public static void main (String args[]){
        String s1 ="hello ";
        String s2 ="world";
        String s3 =new String("FISAT");
        
         System.out.println("first string:"+s1);
          System.out.println("second string:"+s2);
           System.out.println("third string:"+s3);
           System.out.println("-----------------------------");
            System.out.println();
        System.out.println(s1+" "+s2); 
         System.out.print("lengh of first string  ---->" );
        System.out.println("Length of s1 :"+s1.length());
        System.out.print("replacing l with e of HELLO ---->");
        System.out.println(s1.replace('l','e')); 
         System.out.print("CONCATINATION --->");
        System.out.println(s1.concat(s3)); 
        System.out.print("checking both strings are equal --->");
        System.out.println(s1.equals(s2)); 
         System.out.print("changing to uppercase --->");
        System.out.println(s1.toUpperCase()); 
         System.out.print("printing upto index ----> ");
        System.out.println(s1.substring(0,3)); 

    }
}
