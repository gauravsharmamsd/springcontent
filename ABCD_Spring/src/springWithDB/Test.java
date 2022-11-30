package springWithDB;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class Test {
	public static void main(String[] args) throws SQLException {
		
	
		InsertionAndDelete i=new InsertionAndDelete();
	i.insert();
	System.out.println("After insertion");
	i.showDetails();
	System.out.println("After delete");
	i.delete(111);
	i.showDetails();
	
	}}