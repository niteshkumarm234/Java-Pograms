package niteshkumar;

/*
 * Output:do
 * */
public class Program3 {

	public static void main(String[] args) {
		String[] st={"dog","racecardo","cardo"};
		int n=st[0].length();
		String sr="";
		for(int i=0;i<n;i++)
		{
			int flag=0;
			String st1=st[0];
			String st2=st1.substring(0, i+1);
			for(int j=1;j<=st.length-1;j++)
			{
				if(st[j].contains(st2))
				{
					flag=flag+1;
				}
			}
			if(flag==st.length-1)
			{
				sr=st2;
			}else
			{
				//System.out.println("Not have common");
				break;
			}
		}
		System.out.println(sr);
		
		
	

	}

}
