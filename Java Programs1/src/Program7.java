

import java.util.HashSet;
import java.util.Set;

public class Program7 {

	public static void main(String[] args) {
		System.out.println("Decimal to Binary");
		int num=18,num1,num2;
		while(num!=0)
		{
			num1=num%2;
			System.out.print(num1);
			num2=num/2;
			num=num2;
		}
		
	}
	
}
