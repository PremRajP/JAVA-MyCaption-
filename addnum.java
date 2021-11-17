import java.util.Scanner;

public class addnum {
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A");
		a= sc.nextInt();
		
		System.out.println("Enter the value of B");
		b= sc.nextInt();
		
		c=a+b;
		System.out.println("The sum of " +a+ " and "+b+" is "+c);
	}
}
