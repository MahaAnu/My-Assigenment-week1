package week2.day2;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		
		String text = "changeme";
		
		//Convert the given String to a character array.
		char[] chararray =text.toCharArray();
		//- Implement a loop to iterate through each character of the String (from end to start).
		
		for(int i=0;i<text.length();i=i++)
		{
			
			      // get current character 
			     // char c = chararray[i]; 
			      // check if position of this character is odd 
			      if (i % 2 != 0) { 
			        // convert it to upper case 
			        //c = Character.toUpperCase(c); 
			        
			        
			chararray[i]=Character.toUpperCase(chararray[i]);
				System.out.println(chararray);
				
			}
		}
		//- Find the odd index within the loop
		//- Inside the loop, change the character to uppercase only if the index is odd
		//- Print the characters with the expected output: cHaNgEmE

	


}}
