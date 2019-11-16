package call_by_reference;

/**
 * Simple Java program for CallByReference 
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class CalByReference 
{
	int data=50;
	
	void a(CalByReference ob)
	{
		ob.data=ob.data*5;
	}
	

	public static void main(String[] args) 
	{
		CalByReference c=new CalByReference();
		System.out.println("before...");
		System.out.println(c.data);
		System.out.println("After..");
		c.a(c);
		System.out.println(c.data);

	}

}
