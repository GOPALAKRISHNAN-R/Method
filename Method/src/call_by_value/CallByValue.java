package call_by_value;

import java.util.Scanner;

/**
 * Simple Java program for CallByValue
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class CallByValue
{
	
	static int cube(int n)
	{
		n=n*n*n;
		return n;
	}
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n val:");
		n=sc.nextInt();
		System.out.println(cube(n));//call by value
		

	}

}
