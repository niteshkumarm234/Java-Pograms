package niteshkumar;

/* Output:-
 * Enter the array length want :
4
Enter the array :
12
11
1
3
Enter the target value :
4
Array entered is :
  12  11  1  3
Index are :[2, 3]
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		System.out.println("Enter the array length want :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arra = new int[n];
		System.out.println("Enter the array :");
		for(int i=0;i<n;i++)
		{
			arra[i]=sc.nextInt();
		}
		System.out.println("Enter the target value :");
		int target=sc.nextInt();
		System.out.println("Array entered is :");
		for(int i=0;i<arra.length;i++)
		{
			System.out.print("  "+arra[i]);
		}
		System.out.println();
		ArrayList arr1 = new ArrayList();
		for(int i=0;i<arra.length;i++)
		{
			for(int j=i+1;j<arra.length;j++)
			{
				if(arra[i]+arra[j]==target)
				{
					arr1.add(i);
					arr1.add(j);
					break;
				}
			}
		}
		System.out.println("Index are :"+arr1);

	}

}
