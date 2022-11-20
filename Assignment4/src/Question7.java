import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
	
		
				String input= new String();
				
			    int flag=0;
		
			
				
				System.out.println("Write any String :: ");
				 
				Scanner scan= new Scanner(System.in);
				  input=scan.nextLine();
				  
				  char[] arr=input.toCharArray();
				 
				  
				loop:  for(int i=0;i<arr.length-1;i++)
				  {  int j;
					  for(j=i+1 ;j<arr.length;j++)
					  {
						  if(arr[i]==arr[j])
						  {   if(arr[j]!=' ') 
						  	{
							  flag++;
							  break loop; 
						  	}
						  }				  
					
					  }

				  }
					  if(flag==0)
						  System.out.println("String Contains unique Characters :");
		
					
						else
						{
							System.out.println("String Does not Contain unique characters:  ");
						}

		}
}
