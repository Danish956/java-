package Loops2;
import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose digit you want to count  ");
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            n/= 10;
            count++;
            
        }

        System.out.println("the entered number contain    "   +count  );
    }
    
}
