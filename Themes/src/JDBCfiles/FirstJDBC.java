package JDBCfiles;
import java.sql.*;
public class FirstJDBC {

	public static void main(String[] args) throws Exception{
		String url="jdbc:mysql://localhost:3306/world?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";		
		
		String uname="root";
		String pass="budapest";
		
		String query="select * from city";
		
		Class.forName("com.mysql.cj.jdbc.Driver");    
		Connection con=DriverManager.getConnection(url, uname, pass);
		
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			String data=rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5);
			System.out.println(data);
		}		
		st.close();
		con.close();
		
		
	}
}
