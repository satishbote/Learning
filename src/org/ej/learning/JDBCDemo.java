package org.ej.learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.Driver;

public class JDBCDemo {

	public static void main(String[] args) {

		Connection con=null;
		Statement stmt=null;
		String url="jdbc:mysql://localhost:3306/ejagruti_tutorial";
		String query="SELECT * FROM employee";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url, "root", "admin");
			stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
						
			while(rs.next()){
				
				System.out.println(rs.getString(2));
			}		
			
		}
		catch(SQLException | ClassNotFoundException se)
		{
			se.printStackTrace();
		}
		
		finally{
			try{
				if(con!=null)
					con.close();
				if(stmt!=null)
					stmt.close();
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
