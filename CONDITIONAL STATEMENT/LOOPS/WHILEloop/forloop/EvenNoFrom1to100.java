package LOOPS.WHILEloop.forloop;
import java.util.Scanner;

public class EvenNoFrom1to100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range upto which nyou find the even number");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    
}
