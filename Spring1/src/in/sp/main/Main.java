package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {
		String path = "/in/sp/resources/applicationContext.xml";
		ApplicationContext cxt = new AnnotationConfigApplicationContext(path);
		Student s1 = new Student("s1", path, path);
		Student s1 = (Student) cxt.getBean("s1");
		s1.display();
	}
}
