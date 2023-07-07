package LOOPS.WHILEloop.forloop;
import java.util.Scanner;


public class Gp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = sc.nextInt();
        // gp series is 1,2,4,8,16....... upto n
        int a = 1;
        for(int i = 1 ; i <= n; i++){
            a = a*2;
            System.out.println("the required GP series is  " +a);
        }
        
    }
    
}
