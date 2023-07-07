package Loops2;
import java.util.Scanner;

public class Composite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean flag = true;
        for(int i = 2; i<=n-1; i++){
            if(n%i==0){
                flag = false;
                System.out.println("it is a composite number");
               
                break;
                
            }
            if(n==1){
                System.out.println("it is neither prime nor composite");
            }
            if(flag==true) System.out.println("it is a prime");
            

            
        }
       

    }
    
}
