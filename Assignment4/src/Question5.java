import java.util.*;


public class Question5 {

	public static void main(String[] args) {
		
		int count=0;
		String string1=new String();
		String string2=new String();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String 1 ");
		string1=scan.nextLine().toUpperCase();
		System.out.println("Enter String 2");
		string2=scan.nextLine().toUpperCase();
		
		char[] array1=new char[string1.length()]; 
		char[] array2=new char[string2.length()]; 
		
		for(int i=0;i<string1.length();i++)
		{    
			if(string1.charAt(i)!=' ')
			array1[i]=string1.charAt(i);
		}
		for(int i=0;i<string2.length();i++)
		{   
			if(string2.charAt(i)!=' ')
			array2[i]=string2.charAt(i);
		}
		
//		if(array1.length!=array2.length)
//			System.out.println(string1 + " is not anagram of "+ string2);
		
		for(int i=0;i<array1.length;i++)
		{   
			for(int j=0;j<array2.length;j++)
			{ 
				if(array1[i]==array2[j])
				{
					array2[j]='0';
					count++;
					break;
				}
				
			}
		}
			if(count==array1.length)
				System.out.println(string1 + " is anagram of "+ string2);
			else 
			{
				System.out.println(string1 + " is not anagram of "+ string2);
			
			}
			
		
	}

}
