package week2.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {
		
		String text = "We learn Java basics as part of java sessions in java week1";
		//allWords = text.split(" ");
		char[] charary=text.toCharArray();
	//	String[] split = text.split(" ");
	//	System.out.println(split);
		Set<String> sname = new LinkedHashSet<String>();
		for (int i=0;i<charary.length;i++)
		{
			sname.add(text);
		}
		System.out.println(sname);
			/*for(int j=1;j<charary.length;j++)
			{
				
					if(split[i]!=(split[j])) {
					}
					char[] split1 = null;
					
				//	System.out.println("\nSentence after removing duplicate words: " + charary);
			}*/
			
		}
	}


			
		
	


