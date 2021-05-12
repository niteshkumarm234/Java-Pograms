package niteshkumar;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program5 {
	public static void main(String args[])
	{
		String st="hello";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the target string");
		String target=sc.nextLine();
		if(target.length()==0)
		{
			System.out.println("0");
		}else
		{
			if(st.contains(target))
			{
				char ca=target.charAt(0);
				int c=st.indexOf(ca);
				System.out.println(c);
			}else
			{
				System.out.println("-1");
			}
		}
		
		
	}

}
