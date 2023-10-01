package UniversityManagement;
import java.sql.*;
public class ProjectConnection {
	Connection c;
	Statement s;
	ProjectConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem","root","Root@123");
			s=c.createStatement();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
