package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfig;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cxt = new ClassPathXmlApplicationContext
				("/in/sp/resources/applicationContext.xml");
//		String path = "/in/sp/resources/SpringConfig.class";
//		ApplicationContext cxt = new AnnotationConfigApplicationContext(SpringConfig.class);
//		Student std1 = new Student("s1");
		Student s1 = (Student) cxt.getBean("s1");
		s1.display();
//		cxt.getBean("s1");

	}

}
