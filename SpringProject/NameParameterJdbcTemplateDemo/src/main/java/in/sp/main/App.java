package in.sp.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.sp.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
    	
    	NamedParameterJdbcTemplate npJdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);
    	
    	Map<String, Object> map = new HashMap<String, Object>();
    	map.put("key_rollno", 201);
    	map.put("key_name", "Sanju");
    	map.put("key_marks", 97);
    	map.put("key_fees", 2000);
    	
    	String insert_sql_query = "INSERT INTO student VALUES(:key_rollno, :key_name, :key_marks, :key_fees)";
    	
    	int count = npJdbcTemplate.update(insert_sql_query, map);
    	
    	if(count > 0) {
    		System.out.println("Insertion Successfully...");
    	}
    	else {
    		System.out.println("Insertion failled..");
    	}
    	
    	((AnnotationConfigApplicationContext) context).close();
    }
}
