package niteshkumar;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program4 {

	public static void main(String[] args) {
		int[] arr= {2,3,4,5,6,7,8,9};
		String[] str={"abc","def","ghi","jkl","mno","opq","rst","uvw","xyz"};
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		//System.out.println("\"str[1]\"");
		int n=sc.nextInt();
		String st=String.valueOf(n);
		Set<String> stri=new HashSet<String>();
		int len=st.length();
		if(len==1)
		{
			int leng=0;
			System.out.println("You have entered one digit number");
			for(int i=0;i<arr.length;i++)
			{
				if(n==arr[i])
				{
					//System.out.println(str[i]);
					String sn=str[i];
				    leng=str[i].length();
					for(int p=0;p<leng;p++)
					{
					stri.add(str[i].substring(p, p+1));
					}
				}
			}
			
			
			System.out.println(stri);
			
		}
		else if(len==2)
		{
			System.out.println("You have entered two digit number");
			for(int i=0;i<len;i++)
			{
				
			}
		}
		
		

	}

}
