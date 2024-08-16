// import java.util.Scanner;

public class Circle {
    
    public static void main(String args[]){

        // Scanner sc = new Scanner(System.in);

        // int rad = sc.nextInt();
        int rad = Integer.parseInt(args[0]);
        float area = (float)(Math.PI*Math.pow(rad, 2));
        float circ = (float)(2*Math.PI*rad);
        
        System.out.println(area+"\n"+circ);
        // sc.close();
    }
}
