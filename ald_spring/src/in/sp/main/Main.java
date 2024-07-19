package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.user;
import in.sp.resources.ConfigFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext cxt = new 
				AnnotationConfigApplicationContext(ConfigFile.class);
	user u11 = (user) cxt.getBean("user1");
	u11.register();
	
	}

}
