package week3.homeass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting_UsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] comp={"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> name=new ArrayList<String>();
		int len= comp.length;
		
		for(int i=0;i<comp.length;i++)
		{
		name.add(comp[i]);
			
		}
		//System.out.println();
		Collections.sort(name);  
		Collections.reverse(name);
		System.out.println(name);
		System.out.println(len);

	}

}
