package niteshkumar;

import java.util.Scanner;

/*Explanation:
 * nput: height = [7,1,3,4]
Output: 12
Explanation: 1*7=7,3*2=6,4*3=12,1*1=1,3*2=6,4*2=8,etc
             12 is maximum,
             so 12 is answer.


Example 2:

Input: height = [1,1]
Output: 1
Example 3:

Input: height = [4,3,2,1,4]
Output: 16
Example 4:

Input: height = [1,2,1]
Output: 2
 * 
 * OUTPUT:
 * Enter the length of Array : 
5
Enter the array : 
4
3
2
1
4
16
*/
public class Program2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of Array : ");
		int n=sc.nextInt();
		System.out.println("Enter the array : ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int flag=0,p,ans=0,ans1=0;
		for(int i=0;i<n;i++)
		{
		    flag=0;
			for(int j=0;j<n;j++)
			{
				
				if(arr[j]>arr[i])
				{
					flag=flag+1;
					p=arr[i];
					ans1=p*flag;
					if(ans1>ans)
					{
						ans=ans1;
					}
				}else if(arr[i]>arr[j])
				{
					flag=flag+1;
					p=arr[j];
					ans1=p*flag;
					if(ans1>ans)
					{
						ans=ans1;
					}
				
				}
				else
				{
					if(arr[i]==arr[j] && i!=j)
					{
						flag=flag+1;
						p=arr[i];
						ans1=p*flag;
						if(ans1>ans)
						{
							ans=ans1;
						}
					}
				}
				
			}
		}
		System.out.println(ans);
	}

}
