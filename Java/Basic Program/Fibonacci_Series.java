import java.util.*;
public class Fibonacci_Series {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=0, b=1, c, num;
        num = sc.nextInt();
        System.out.print(0+" "+1+" ");
        for(int i = 0; i < num; i++){
            c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
        sc.close();
    }
}
