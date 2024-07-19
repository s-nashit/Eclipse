package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.user;

@Configuration
public class ConfigFile {
	@Bean
	public user user1() {
		user u1 = new user();
		u1.setUname("anjali");
		u1.setPass("a_123");
		u1.setMail("anjali@123");
		
		return u1;
	}
	
}
