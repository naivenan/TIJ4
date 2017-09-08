package exercise.ch6;

public class Ex08 {

	public static void main(String[] args) {
		for(int i=0;i<7;i++)
			System.out.println(ConnectionManager.getConnection());
	}

}

class ConnectionManager{
	private ConnectionManager(){}
	private static int index = 0;
	private static Connection[] array = new Connection[5];
	static {
		for(int i=0;i<array.length;i++){
			array[i] = Connection.getConnection();
		}
	}
	
	public static Connection getConnection(){
		if(index<array.length)
			return array[index++];
		return null;
	}
}

class Connection{
	private Connection(){}
	static Connection getConnection(){
		return new Connection();
	}
}