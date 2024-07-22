package in.sp.recources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfig {

	
	@Bean
	public Student std1() {
//		Student s1 = new Student("Lucknow" , "Anjali", "anjali123@abc.com");
		Student s1 = new Student(null, null, null);
		s1.setName("anjali");
		s1.setMail("anjali@abc.com");
		s1.setLocation("prayagraj");
		
		return s1;
	}
}
