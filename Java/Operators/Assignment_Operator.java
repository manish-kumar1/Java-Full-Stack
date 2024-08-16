import java.util.Scanner;


public class Assignment_Operator{
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the first Number");
        a = sc.nextInt();
        System.out.println("Enter the second Number");
        b = sc.nextInt();

        // Arithmetic Operators in Java
        //+=, -=, *=, /=, %= these are Arithmetic operators

        a += b;
        System.out.println(a);
        a -= b;
        System.out.println(a);
        a *= 2;
        System.out.println(a);


        sc.close();
    }
}