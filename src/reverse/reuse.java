package reverse;

public class reuse
{

	public void reverseOfString(String s) {
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse of String:"+rev);
	}
	
	
	
	public void removeSpaces(String s1) {
		
		System.out.println(s1.replace(" ", "@"));
	}

}
