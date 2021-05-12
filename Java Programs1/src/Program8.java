

/*  Write a program to find fibonacci series  */

public class Program8 {

	public static void main(String[] args) {
		int num=9;
		int n1=0,n2=1,sum;
		for(int i=1;i<=9;i++)
		{
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
		}
		
	}
	
}
