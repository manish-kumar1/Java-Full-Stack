package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.beans.Student;
import in.sp.mapper.StudentMapper;
import in.sp.resources.SpringConfigFile;

class App {
	public static void main(String[] args) {

		/*
		 * String roll_no = "200"; String name = "Alex"; String marks = "99"; String
		 * fees = "9000";
		 */

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

		// ----------------INSERT OPERATION-----------------------
		/*
		 * 
		 * String insert_sql_query = "INSERT INTO student VALUES(?, ?, ?, ?)"; int count
		 * = jdbcTemplate.update(insert_sql_query, roll_no, name, marks, fees);
		 * 
		 * if(count > 0) { System.out.println("Insertion successfully"); } else {
		 * System.out.println("Insertion failled"); }
		 */

		// ----------------------UPDATE OPERATION------------------
		/*
		 * float new_marks = 90.5f; String roll_no = "12";
		 * 
		 * String update_sql_query = "UPDATE student SET marks=? WHERE roll_no=?"; int
		 * count = jdbcTemplate.update(update_sql_query, new_marks, roll_no);
		 * 
		 * if(count > 0) { System.out.println("Updated Successfully.."); } else {
		 * System.out.println("Updation failled..."); }
		 */

		// ------------------DELETE OPERATION-----------------------

		/*
		 * String roll_no = "123";
		 * 
		 * String delete_sql_query = "DELETE FROM student WHERE roll_no=?"; int count =
		 * jdbcTemplate.update(delete_sql_query, roll_no);
		 * 
		 * if(count > 0) { System.out.println("Deletion Successfully.."); } else {
		 * System.out.println("Deletion failled.."); }
		 */

		// -----------------READ OPERATION----------------
		/*
		 * String select_sql_query = "SELECT *FROM student"; List<Student> std_list =
		 * jdbcTemplate.query(select_sql_query, new StudentMapper());
		 * 
		 * for(Student std : std_list) {
		 * System.out.println("Roll No: "+std.getRollno());
		 * System.out.println("Name: "+std.getName());
		 * System.out.println("Marks: "+std.getMarks());
		 * System.out.println("Salary: "+std.getSalary());
		 * 
		 * System.out.println("---------------------------------"); }
		 */

		// ---------------SELECT OPERATION 2-----------------------
		/*
		 * int rollno = 200; String select_sql_query =
		 * "SELECT *FROM student WHERE roll_no=?"; List<Student> std_list =
		 * jdbcTemplate.query(select_sql_query, new StudentMapper(), rollno);
		 * 
		 * for(Student std : std_list) {
		 * System.out.println("Roll No: "+std.getRollno());
		 * System.out.println("Name: "+std.getName());
		 * System.out.println("Marks: "+std.getMarks());
		 * System.out.println("Salary: "+std.getSalary());
		 * 
		 * System.out.println("---------------------------------"); }
		 */

		// -----------------SELECT OPERATION FOR SINGLE ROW-------------

		int rollno = 200;
		String select_sql_query = "SELECT *FROM student WHERE roll_no=?";
		Student std = jdbcTemplate.queryForObject(select_sql_query, new StudentMapper(), rollno);

		System.out.println("Roll No: " + std.getRollno());
		System.out.println("Name: " + std.getName());
		System.out.println("Marks: " + std.getMarks());
		System.out.println("Salary: " + std.getSalary());

		((AnnotationConfigApplicationContext) context).close();
	}
}
