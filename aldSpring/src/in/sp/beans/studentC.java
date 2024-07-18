package in.sp.beans;

public class studentC {
	String name;
	int age;
	String mail;
	long phone;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public long getPhone() {
		return phone;
	} 
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public void show() {
		System.out.println(name+"--"+age+"--"+mail+"--"+phone+"--");
	}

}
