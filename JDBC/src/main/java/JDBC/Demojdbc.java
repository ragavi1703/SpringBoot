package JDBC;
import java.sql.*;

public class Demojdbc {
	public static void main(String [] args) throws Exception {
	Class.forName("org.postgresql.Driver"); 
	
	//Getting from user for example
	int sid=10;
	String sname="Vihara";
	int marks=94;
	
	
	// it is optional Java should know which DB you are using hence mentioned here
	//use try catch here instead of throws exception
	//connection is an interface so no use new connection()
	
	String url="jdbc:postgresql://localhost:5432/demo";
	String uname="postgres";// default user name
	String pwd ="Ragavi.S03$";
	String sql="insert into student values(?,?,?)";
	//Initialized with ? at first
	//It is not recommended to use like this hence using prepared statement
	//String sql="insert into student values("+sid+",'"+sname+"',"+marks+")";
	
	//This query is for deleting 
	//String sql="delete from student where sid=6";
	
//	String sql="update student set sname='Thanish' where sid=6";
//	This query is for updating the DB
	//This query is for reading from the Database
	//String sql="select * from student";
	
	Connection con = DriverManager.getConnection(url, uname, pwd);
	//System.out.println("Connected");
	PreparedStatement st=con.prepareStatement(sql);
	st.setInt(1, sid);//It has two parameters the column id and the value to be inserted
	st.setString(2, sname);
	st.setInt(3, marks);
	//Statement st=con.createStatement();
	//here execute instead of execute query
	//boolean status=st.execute(sql);
	st.execute();
//	System.out.print(status);
	//This is for reading data from the database knowing the number of columns
//	ResultSet rs=st.executeQuery(sql);
	//this executequery gives result set
	//resultSet is an interface
	

	
	//next is method that return boolean value 
		//true - data is fetched from DB
		//false - no data 
		//System.out.println(rs.next());
		//Instead of getting true or false we can try some methods
		// This method asks for column name which is specified as sname
		// column number can also be used here
//	rs.next();
//	String name=rs.getString("sname");
//	System.out.println(name);
	
//	while(rs.next()) {
//		System.out.print(rs.getInt(1)+" - ");
//		System.out.print(rs.getString(2)+" - ");
//		System.out.print(rs.getInt(3));
//		System.out.println();
		
		
		
//	}
	con.close();
	//System.out.println("Connection closed");
	
	

	}

}
