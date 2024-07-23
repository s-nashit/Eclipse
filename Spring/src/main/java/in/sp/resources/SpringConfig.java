package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;
import in.sp.beans.skills;

@Configuration
public class SpringConfig {
	
	@Bean
	public skills skobj() {
		skills sk1 = new skills("MEAN", "AWS", "Tensorflow"); 
//		skills sk1 = new skills();
//		sk1.setWeb("HTML");
//		sk1.setCloud("AWS");
//		sk1.setDa("Python");
		return sk1;
	}
	
	@Bean
	public Student s1() {
		Student s1 = new Student("anjali", "anajli@gmail.com", "paryagraj", skobj());
//		Student s1 = new Student();
//		s1.setName("nashit");
//		s1.setMail("nashit@gmail.com");
//		s1.setLocation("Patna");
//		s1.setskills(skobj());
		return s1;
	}

}

