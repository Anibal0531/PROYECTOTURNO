package Modelo;

import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connection {
	Connection cn;
	Statement st;
	ResultSet rs;
	 
	public Connection() throws ClassNotFoundException, SQLException {
		Class.forName("org.h2.driver");
		cn =(Connection) DriverManager.getConnection("jdbc:h2:lib//database","sa","");
		st = cn.st;
	}
    
}
