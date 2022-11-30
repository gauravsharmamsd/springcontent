package springWithDB;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class InsertionAndDelete {
	java.sql.Statement st;
	public InsertionAndDelete (){
	
		
		JDBC_Connector c=new JDBC_Connector();
		//c.createConnection();
		  

			try {
				st= c.createConnection().createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public void insert() throws SQLException {
	System.currentTimeMillis();
//	
//	String q1="create table  demo(eid int,ename varchar(5),esal int)";
//
//	int p=st.executeUpdate(q1);
	//System.out.println("Table created Succesfully"+p);
	 String q2="insert into demo values(111,'Gaur',1000)";
	 String q3="insert into demo values(222,'Ajay',1500)";
	 String q4="insert into demo values(333,'Suraj',2000)";
	 String q5="insert into demo values(4444,'Monu',3500)";
	 st.executeUpdate(q2);
	 st.executeUpdate(q3);
	 st.executeUpdate(q4);
	 st.executeUpdate(q5);
	}
	void showDetails() throws SQLException {
		 String q6="select * from demo";
			
		 ResultSet set= st.executeQuery(q6);
			while (set.next()) {
				System.out.println(set.getInt(1)+"   "+set.getString(2)+"  "+set.getInt(3));
			}
	}
	public void delete(int i) throws SQLException {
		
		String delQ="delete from demo where eid ="+i;
		st.executeUpdate(delQ);
	}


}