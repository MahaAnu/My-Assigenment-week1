package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		int num=121,i,r;
		int t=num;
 	   for(i=0;num>0;num/=10)
 	   {
 		   r=num%10;
 		   i=(i*10)+r;
 	   }
 	   
 	   if(i==t)
 		   System.out.println(t+" is a palindrome number ");
      

}}
