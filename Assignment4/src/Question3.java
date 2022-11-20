import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		int flag=0;
		String input=new String();
		System.out.println("Write any String : ");
		Scanner scan =new Scanner(System.in);
		
		input=scan.nextLine();
	
		
		for(int i=0 , j=input.length()-1 ;  i< input.length() && j>=0 ; i++ , j--)
		{
				if(input.charAt(i)!=input.charAt(j))
				{
					flag++;
					break;
					
				}
					
			
		}
		if(flag==0)
			System.out.println(input+ " is Palindrome");
		else
			System.out.println(input + " is not  palindrome");

	}

}
