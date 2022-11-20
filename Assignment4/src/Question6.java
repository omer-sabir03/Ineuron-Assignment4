import java.util.*;

public class Question6 {

	public static void main(String[] args) {
		 Boolean flag=false;
		System.out.println("Write any string : ");
		String input=new String();
		
		Scanner scan=new Scanner(System.in);
		
		input=scan.nextLine().toUpperCase();
		
		
		char[] arr=new char[input.length()];
		
		for(int i=0;i<input.length();i++)
		{
			arr[i]=input.charAt(i);
		}
		
		
		int[] checkArray=new int[26];
		
		for(int i=0;i<arr.length;i++)
		{    if(arr[i]!=(char)32)
			checkArray[arr[i]-65]=1;
		}
			
		for(int elem:checkArray)
		{
			if(elem==0)
			{
				System.out.println(input +" is not panagram");
				flag=true;
				break;
			}
		}
		if (flag==false)
			System.out.println(input + "  is panagram");
		
	}

	
}
