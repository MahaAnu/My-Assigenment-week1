package week4;

public interface DatabseConnection {

	public abstract void connect(); 
	public abstract void disconnect() ;
	public abstract void executeUpdate();
}
