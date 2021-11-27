package mc;

import java.util.Scanner;
public class primeno{
public static void main(String args[])
{
boolean isPrime=true;
Scanner scan= new Scanner(System.in);
System.out.println("Enter any number:");
int num=scan.nextInt();
scan.close();
int i=2;
while(i<= num/2)
{
if(num % i == 0)
{
isPrime = false;
break;
}
i++;
}
if(isPrime)
System.out.println(num + " is a Prime Number");
else
System.out.println(num + " is not a Prime Number");
}
}
