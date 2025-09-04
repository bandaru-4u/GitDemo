package DatabaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String host = "localhost";
		String port = "3306";
		
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/databasename", "root", "Clopay1!");
		
		/*Connection String -> "jdbc:mysql://"+host+":"+port+"/databasename";
		  "jdbc:mysql://"+localhost+":"3306+"/demo";
		 */
		
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from credentials where scenario ='rewardscard");
		
		while(rs.next())
		{
			System.out.println(rs.getString("username"));
			System.out.println(rs.getString("password"));
			


		}
		
	}

}
