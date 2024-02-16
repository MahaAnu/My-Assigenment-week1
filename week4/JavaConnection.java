package week4;

public class JavaConnection implements DatabseConnection {

	
	public  void connect() 
	{
		System.out.println("The data base is connected");
	}
		
		
		public  void disconnect()
		{
			System.out.println("The data base is disconnected");
		}
		public  void executeUpdate() 
		{
			System.out.println("The data base is updated");
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection obj = new JavaConnection();
		
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();
	
	
	}

}
