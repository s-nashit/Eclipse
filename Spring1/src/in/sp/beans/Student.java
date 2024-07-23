package in.sp.beans;

public class Student {
	private String name;
	private String mail;
	private String location;
	private in.sp.beans.skills skills;
//	String skills;
//	
//	public Student(String name, String mail, String location, skills skills) {
////		constructors
//		this.name = name;
//		this.mail = mail;
//		this.location = location;
//		this.skills = skills;
//	}

	public String getName() {
		return name;
	}
//	/**
//	 * @param name the name to set
//	 */
	public void setName(String name) {
		this.name = name;
	}
//	/**
//	 * @return the mail
//	 */
	public String getMail() {
		return mail;
	}
//	/**
//	 * @param mail the mail to set
//	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
//	/**
//	 * @return the location
//	 */
	public String getLocation() {
		return location;
	}
	
	public void setskills(in.sp.beans.skills skills) {
		this.skills=skills;
	}
//	/**
//	 * @param location the location to set
//	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void display() {
		System.out.println(name+"  --  " + mail + " -- " + location + " -- "+skills);
		}

}
