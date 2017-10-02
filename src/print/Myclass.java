package print;

import java.util.Scanner;

public class Myclass {
	int num1;
	int num2;
	Scanner k=new Scanner(System.in);
	int mark1,mark2,mark3;
	float avg;
public void get() {
	System.out.println("enter the num");
	
	num1=k.nextInt();
	
	
	
	if(num1==0)
	{
		System.out.printf("You Have Entered Zero and ascii value is \n"+ (char) num1);
	}
	else if(num1>0)
	{
		System.out.printf("You Have Entered posative value and ascii value is \n"+ (char) num1);
	}
	else
	{	num1=num1*-1;
		System.out.printf("You Have Entered negative value and ascii value is \n"+ (char) num1);
	}	
}
public void result()
{
	System.out.println("\nenter the students pcm marks");
	mark1=k.nextInt();
	mark2=k.nextInt();
	mark3=k.nextInt();
	avg=(mark1+mark2+mark3)/3;
	if(avg>70)
		System.out.println("student got A grade");
	else if(avg>=61&avg<=70)
		System.out.println("student got B grade");
	else
		System.out.println("student got C grade");
		
}
public static void main(String args[])
{
	Myclass my=new Myclass();
	my.get();
	my.result();
}
}
