package in.sp.beans;

public class Student {
	private String name;
	private String mail;
	private String location;
	
	
	public Student(String name, String mail, String location) {
		this.name = name;
		this.mail = mail;
		this.location = location;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void display() {
		System.out.println(name+ "--" +mail + "--"+ location);
	}
	
	
	
	
}
