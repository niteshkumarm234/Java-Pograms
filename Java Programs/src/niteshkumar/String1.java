package niteshkumar;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input String");
		String st=sc.nextLine();
		System.out.println("Enter the Target String");
		String tar=sc.nextLine();
		int tn=tar.length();
		System.out.println(tar.charAt(0));
		//char[] ch=tar.toCharArray();
		System.out.println(tar);
		int flag,pre;
		for(int i=0;i<tn;i++)
		{
			flag=0;
			if(tar.charAt(i)==42)
			{
				pre=i-1;
				flag=flag+1;
			}
			char c=tar.charAt(i);
			if(st.charAt(i)==c)
			{
				
			}
		}

	}

}
