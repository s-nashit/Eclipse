package in.sp.beans;

public class user {
	String uname;
	String pass;
	String mail;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public void register() {
		System.out.println(uname+"--"+ pass+ "--"+ mail );
	}

}
