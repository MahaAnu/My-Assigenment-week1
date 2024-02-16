package week2.day2;

public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String sample = "changeme"; 
		   
		    StringBuffer updatedString = new StringBuffer(); 
		     
		    char[] characters = sample.toCharArray(); 
		   
		    for (int i = 0; i < characters.length; i++) { 
		     
		      char c = characters[i]; 
		   
		      if (i % 2 != 0) { 
		      
		        c = Character.toUpperCase(c); 
		      } 
		       
		      updatedString.append(c); 
		    } 
		    System.out.println("Modified string is: " + updatedString.toString()); 
		  


	}

		

}

