package ArrayIndex;

public class ExceptionArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,};
		System.out.println(a[0]+"\n"+a[2]);
		try
		{
			System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("invaid index ");
		}
	}
}
