package niteshkumar;

import java.util.Scanner;

/*Program to find  decimal of given binary number*/

public class Program10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to convet to decimal");
		int n=sc.nextInt();
		int num;
		String st=String.valueOf(n);
		int len=st.length();
		int count,sum=0;
		for(int i=0;i<st.length();i++)
		{
			num=(int)Math.pow(2, i);
			count=n%10;
			n=n/10;
			sum=sum+(count*num);
			len=len-1;
		}
		System.out.println("Decimal value is :"+sum);
		

	}

}
