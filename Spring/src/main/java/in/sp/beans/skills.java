package in.sp.beans;

public class skills {
	String web;
	String cloud;
	String da;
//	public skills(String web, String cloud, String da) {
//		
//		this.web = web;
//		this.cloud = cloud;
//		this.da = da;
//	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getCloud() {
		return cloud;
	}
	public void setCloud(String cloud) {
		this.cloud = cloud;
	}
	public String getDa() {
		return da;
	}
	public void setDa(String da) {
		this.da = da;
	}
	
	@Override
	public String toString() {
		return web + ", " + cloud + ", " + da;
	}
	
	
	
	
	

}
