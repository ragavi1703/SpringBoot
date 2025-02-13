package com.example.springJDBCEx.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.springJDBCEx.model.Student;

@Repository
public class StudentRepo {
	
	private JdbcTemplate jdbc;
	

	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	@Autowired
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	public void save(Student s) {
		String sql="insert into student (name,rollNo,marks) values (?,?,?)";
		int rows=jdbc.update(sql,s.getName(),s.getRollNo(),s.getMarks());
		System.out.println(rows);
				
		
	}

	public List<Student> findAll() {
		//the full code 
//		RowMapper <Student> mapper=new RowMapper<Student>() {
//		@Override
//		public Student mapRow(ResultSet rs,int rowNum) throws SQLException{
//			Student s=new Student();
//			s.setName(rs.getString("name"));
//			s.setRollNo(rs.getInt("rollno"));
//			s.setMarks(rs.getInt("marks"));
//			return s;
//		}
//	};
		
		
		//The other way
		
//		RowMapper <Student> mapper=(rs,rowNum)->{
//			Student s=new Student();
//			s.setName(rs.getString("name"));
//			s.setRollNo(rs.getInt("rollno"));
//			s.setMarks(rs.getInt("marks"));
//			return s;
//		
//	};

		String sql="select * from student";
		
		//return jdbc.query(sql,mapper);
		
		
		return jdbc.query(sql, (rs,rowNum)->{
			Student s=new Student();
			s.setName(rs.getString("name"));
			s.setRollNo(rs.getInt("rollno"));
			s.setMarks(rs.getInt("marks"));
			return s;
		
	});
//		List <Student> students=new ArrayList<>();
//		
//		return students ;
	}

}
