import java.util.*;

public class Question4 {

	public static void main(String[] args) {
		int vowel=0;
		int consonents=0;
		int specialCharacters=0;
	
		
		String input=new String();
		
		System.out.println("write any string : ");
		
		Scanner scan=new Scanner(System.in);
		input=scan.nextLine();
		
	    input=input.replace(" ", "").toLowerCase();
	    
	    int length=input.length();
	    
	    char arr[]=new char[length];
	      arr=input.toCharArray();
	    
	    for(int i=0;i<arr.length;i++)
	    {
	    	if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
	    		vowel++;
	    	else if(arr[i]=='!'||arr[i]=='@'||arr[i]=='#'||arr[i]=='$'||arr[i]=='%'||arr[i]=='^'||arr[i]=='&'||arr[i]=='*'||arr[i]=='('||arr[i]==')')
	    		specialCharacters++;
	    	
	    	else
	    		consonents++;
	    	
	    }
		System.out.println("vowels : "+ vowel + " Consonents : "+ consonents +  " Special Characters: " + specialCharacters);

	}

}
