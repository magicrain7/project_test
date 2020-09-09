package customer;

public class CustomerVO {
	private String c_id;
	private String pw;
	private String email;
	private String name;
	private String phone;
	private String birth;
	private String gender;
	private String address;
	
	
	
	
	public CustomerVO(String c_id, String pw, String email, String name, String phone, String birth, String gender,
			String address) {
		super();
		this.c_id = c_id;
		this.pw = pw;
		this.email = email;
		this.name = name;
		this.phone = phone;
		this.birth = birth;
		this.gender = gender;
		this.address = address;
	}
	public CustomerVO() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CustomerVO [c_id=" + c_id + ", pw=" + pw + ", email=" + email + ", name=" + name + ", phone=" + phone
				+ ", birth=" + birth + ", gender=" + gender + ", address=" + address + "]";
	}
	public String getC_id() {
		return c_id;
	}
	public void setC_id(String c_id) {
		this.c_id = c_id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
