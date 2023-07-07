import java.util.Scanner;
public class SimpleInterest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thye principal amount  ");
        float p = sc.nextFloat();
        System.out.println("Enter the time  ");
        float t = sc.nextFloat();
        System.out.println("Enter the rate");
        float r = sc.nextFloat();
        float a = (p * t * r)/100;
        System.out.println("The calculated si is   " +a);
    }
}
