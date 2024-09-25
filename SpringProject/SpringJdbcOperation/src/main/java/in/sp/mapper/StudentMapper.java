package in.sp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.sp.beans.Student;

public class StudentMapper implements RowMapper<Student>{
	
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException{
		
		Student std = new Student();
		
		std.setRollno(rs.getInt("roll_no"));
		std.setName(rs.getString("name"));
		std.setMarks(rs.getFloat("marks"));
		std.setSalary(rs.getInt("fees"));
		
		 
		
		return std;
	}

}
