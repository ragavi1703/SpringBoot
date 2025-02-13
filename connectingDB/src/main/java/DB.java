import java.sql.*;
class DB{
	public static void main(String [] args) throws Exception {
		
		String url="jdbc:postgresql://localhost:5432/Practice";
		String uname="postgres";
		String pwd="Ragavi.S03$";
		
		
		
		String sql="select * from employee";
		
		Connection con= DriverManager.getConnection(url, uname, pwd);
		System.out.println("Connection Established");
		Statement st=con.createStatement();
        ResultSet rs = st.executeQuery(sql);
		
		
		while(rs.next()) {
			System.out.print(rs.getInt(1)+ " : ");
			System.out.print(rs.getString(2)+ " : ");
			System.out.print(rs.getDouble(3));
			System.out.println();
			
			
		}
		con.close();
		
		
	}
}