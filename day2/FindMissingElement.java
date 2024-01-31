package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int a[]={1, 4,3,2,8, 6, 7};
		
		Arrays.sort(a);
		
		for(int i=1;i<a.length;i++)
		{
			if (i!=a[i-1])
			{
				System.out.println(i);
				break;
				
			}
		}
	}

}
