package LOOPS.WHILEloop.forloop;
import java.util.Scanner;

public class HelloWorNtims {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of time upto which you want print the messege  ");
        int n = sc.nextInt();
        int i;
        for( i=1; i <= n; i++){
            System.out.println("  Good Morning Love");
            System.out.println(i);
           
        }
        
      

    }
    
}
