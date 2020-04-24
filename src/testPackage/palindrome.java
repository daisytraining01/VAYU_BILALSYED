package testPackage;

public class palindrome {

	public static void main(String[] args) {
		    
		String Reverse = "";
		   
		  String str = "abba"; 
		    
		      
		     
		        for (int i=str.length()-1; i>=0;i--)
		        {
		            Reverse = Reverse + str.charAt(i);
		        
		        }
		        
		       
		    
		      
		  
		        if (str.equals(Reverse))
		            System.out.print("Yes"); 
		        else
		            System.out.print("No"); 
		    } 
		

	}


