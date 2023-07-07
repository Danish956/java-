import java.util.Scanner; // imported the utill class scanner for taking the inpuuts  
public class TakingInputInArray   
{  
public static void main(String[] args)   
{  
int n;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");  
 
n=sc.nextInt();  
//creates an array in the memory of length 10  
int[] array = new int[10];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  
  
array[i]=sc.nextInt();  
}  
System.out.println("Array elements are: ");  

for (int i=0; i<n; i++)   
{  
System.out.println(array[i]);  
}  
}  
}