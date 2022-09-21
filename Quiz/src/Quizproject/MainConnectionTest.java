package Quizproject;
import java.sql.Connection;
import java.sql.DriverManager;


public class MainConnectionTest {

	
Connection connection ;
public Connection getconnectionDetail() {
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
	
	
	}catch(Exception e) {
		System.out.println(e);
	}
	return connection;
}

	

}
