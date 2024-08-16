import java.util.Scanner;

public class Relational_Operator {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second Number");
        b = sc.nextInt();

        // Relational Operator 
        // ==, !=, >, <, >=, <= these are relational operators

        System.out.println(a==b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);

        sc.close();
    }
}
