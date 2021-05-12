

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter the number to check palindrome or not");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String sc1=String.valueOf(n);
		String sc2="";
		for(int i=sc1.length()-1;i>=0;i--)
		{
			sc2=sc2+sc1.charAt(i);
		}
		if(sc1.equals(sc2))
		{
			System.out.println("True");
		}else {
			System.out.println("False");
		}

	}

}
