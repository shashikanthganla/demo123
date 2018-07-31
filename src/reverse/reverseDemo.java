package reverse;

public class reverseDemo {

	public void reuse1() {
		String s ="posani prabhas mr ";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		String g=s.substring(0, 6);
		System.out.println(g);
		String rev1="";
		for(int j=g.length()-1;j>=0;j--)
		{
			rev1=rev1+g.charAt(j);
		}
		System.out.println(rev1);
		String g1=s.substring(7, 14);
		System.out.println(g1);
		String rev2="";
		for(int k=g1.length()-1;k>=0;k--)
		{
			rev2=rev2+g1.charAt(k);
		}
		System.out.println(rev2);
		System.out.println(s);
		
	   String h="$";
	   String r=g+h+g1;
	   
	   
	  System.out.println(s.replace(" ", "$"));

	}

}
