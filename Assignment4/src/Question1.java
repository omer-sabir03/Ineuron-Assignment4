import java.util.Scanner;

public class Question1 {
	public static void main(String [] args)
	{   int count;
		String input= new String();
		System.out.println("Write any String :: ");
		 
		Scanner scan= new Scanner(System.in);
		  input=scan.nextLine();
		  
		  char[] arr= input.toCharArray();
		
		  for(int i=0;i<arr.length;i++)
		  {  count=0;
			  for(int j=i+1 ;j<arr.length;j++)
			  {
				  if(arr[i]==arr[j] && arr[i]!=' ')
				  {  
					 arr[j]='0'; 
					 count++;
				   }
		      }
			  if(count!=0)
				  arr[i]='0';
			 
			  if(arr[i]!='0' )
				  System.out.print(arr[i]);
			  
	       }
			  	 
		  
		  
		  
		  
		 
	}
}