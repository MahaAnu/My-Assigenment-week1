package week1.day1;

public class Mobile {
	
	public void makeCall(String mm,float mw)
	{
		System.out.println("The mobile model is:  "+ mm);
		System.out.println("The mobile weight is:  "+mw);
		
	}
	
	public void sendMeg(boolean fch,int mc)
	{
		System.out.println("The mobile isFullCharged :  "+fch);
		System.out.println("The mobile cost is  :  "+mc);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile phone = new Mobile();
		phone.makeCall("iphone15 pro max", 25.5f);
		phone.sendMeg(false, 75000);
		
//System.out.println("This is my mobile");
	}

}
