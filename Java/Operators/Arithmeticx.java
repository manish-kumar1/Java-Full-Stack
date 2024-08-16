// package Java.Operators;
import java.util.Scanner;


public class Arithmeticx {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the first Number");
        a = sc.nextInt();
        System.out.println("Enter the second Number");
        b = sc.nextInt();

        // Arithmetic Operators in Java
        // +, -, *, /, % these are Arithmetic operators

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        sc.close();
    }
}
