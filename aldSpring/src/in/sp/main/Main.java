package in.sp.main;

public class Main {
	public static void main(String[] args){
		
		ApplicationContext cxt = new 
				ClassPathXmlApplicationContext("/in/sp/config/applicationContext.xml");
		
		studentC u1 = (studentC) cxt.getBean("user1");
		u1.register();
		


	}
}

