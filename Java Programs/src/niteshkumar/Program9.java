package niteshkumar;

import java.util.Scanner;

/*Program to find HCF and LCM of number*/


public class Program9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  first number to find lcm and hcf");
		int num1=sc.nextInt();
		System.out.println("Enter the second number to find lcm and hcf");
		int num2=sc.nextInt();
		int high,low,sum=0;
		if(num1<num2)
		{
			System.out.println(+num2+" Is greater number");
			high=num2;
			low=num1;
		}else
		{
			System.out.println(+num1+" Is greater number");
			high=num1;
			low=num2;
		}
		sum=low;
		while(low%high!=0)
		{
			low=low+sum;
			if(low%high==0)
			{
				System.out.println("LCM is :"+low);
				break;
			}
		}
		for(int i=high;i>0;i--)
		{
			if(num1%i==0 && num2%i==0)
			{
				System.out.println("HCF is : "+i);
				break;
			}
		}

	}

}
