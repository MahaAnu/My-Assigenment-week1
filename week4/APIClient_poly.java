package week4;

public class APIClient_poly {
	public void sendRequest(String endpoint)
	{
		System.out.println("This is endpoint send request :"+endpoint);
		

	}
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus)
	{
		System.out.println("This is endpoint send request with request body :"+endpoint);
		System.out.println("This is endpoint send request with request body :"+requestBody);
		System.out.println("This is endpoint send request with request body :"+requestStatus);
	}
	

	public static void main(String[] args) {
		
		APIClient_poly api = new APIClient_poly();
		api.sendRequest("module1");
		api.sendRequest("module2", "test", true);
	}
}
