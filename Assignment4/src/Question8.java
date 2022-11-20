import java.util.*;

public class Question8 {
      
	public static void main(String[] args) {
	    int max=0;
	    int index=0;
		System.out.println("White a String : ");
		String input=new String();
		Scanner scan = new Scanner(System.in);
		input=scan.nextLine();
		
		input=input.toUpperCase().replace(" ", "");
		
		
		
		char[] inputArr=input.toCharArray();
		char[] ch=new char[26];
		
		for(int i=0;i<inputArr.length;i++)
		{
		  ch[inputArr[i]-65]++;	
		}		
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>max)
			{
				max=ch[i];
				index=i;
				
		}
		}
		System.out.println("One of Maximum Occuring character is : "+ (char) (index+65));
		
	
	

}
}