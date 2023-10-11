package com.Dao;

public class SG {

	private int user_id;
	private String usename;
	private String password;
	private String email;
	private String phone;
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsename() {
		return usename;
	}
	public void setUsename(String usename) {
		this.usename = usename;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public SG(int user_id, String usename, String password, String email, String phone) {
		super();
		this.user_id = user_id;
		this.usename = usename;
		this.password = password;
		this.email = email;
		this.phone = phone;
	}
	public SG(String usename, String password, String email, String phone) {
		super();
		this.usename = usename;
		this.password = password;
		this.email = email;
		this.phone = phone;
	}
//	@Override
//	public String toString() {
//		return "SG [user_id=" + user_id + ", usename=" + usename + ", password=" + password + ", email=" + email
//				+ ", phone=" + phone + "]";
//	}
	
	
	
}
