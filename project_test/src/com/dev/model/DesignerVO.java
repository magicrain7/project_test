package com.dev.model;

public class DesignerVO {
	private String id;
	private String phone;
	private String email;
	private String pw;
	private String holiday;
	private String workstart;
	private String workend;
	
	
	public DesignerVO(String id, String phone, String email, String pw, String holiday, String workstart,
			String workend) {
		super();
		this.id = id;
		this.phone = phone;
		this.email = email;
		this.pw = pw;
		this.holiday = holiday;
		this.workstart = workstart;
		this.workend = workend;
	}
	public DesignerVO() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DesignerVO [id=" + id + ", phone=" + phone + ", email=" + email + ", pw=" + pw + ", holiday=" + holiday
				+ ", workstart=" + workstart + ", workend=" + workend + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getHoliday() {
		return holiday;
	}
	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}
	public String getWorkstart() {
		return workstart;
	}
	public void setWorkstart(String workstart) {
		this.workstart = workstart;
	}
	public String getWorkend() {
		return workend;
	}
	public void setWorkend(String workend) {
		this.workend = workend;
	}
	
	
	
	
}
