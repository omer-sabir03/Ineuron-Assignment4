import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
         int count;
		String input=new String();
		
		System.out.println("Write Any String :");
		Scanner scan=new Scanner(System.in);
		input=scan.nextLine();
		
	    char[] arr=input.toCharArray();
	    
	  
	    for(int i=0;i<arr.length-1;i++)
	    {    count=0;
	    	for(int j=i+1;j<arr.length;j++)
	    	{
	    		if(arr[i]==arr[j] & arr[i]!=' ')
	    		{
	    			count++;
	    			arr[j]='0';
	    		}
	    	}
	    	
	    	if(count>0 && arr[i]!='0')
	    	{
	    		System.out.print(arr[i]+ " " );
	    	}
	        }
		

	}

}
