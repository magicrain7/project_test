package com.dev.model;

public class CustomerReservationVO {
	private Integer r_number;
	private String r_date;
	private Integer show_number;
	private String state;
	private String paycode;
	private Integer online_pay; 
	//참조키고객번호 디자이너번호
	

	@Override
	public String toString() {
		return "CustomerReservationVO [r_number=" + r_number + ", r_date=" + r_date + ", show_number=" + show_number
				+ ", state=" + state + ", paycode=" + paycode + ", online_pay=" + online_pay + "]";
	}
	
	public CustomerReservationVO(Integer r_number, String r_date, Integer show_number, String state, String paycode,
			Integer online_pay) {
		super();
		this.r_number = r_number;
		this.r_date = r_date;
		this.show_number = show_number;
		this.state = state;
		this.paycode = paycode;
		this.online_pay = online_pay;
	}

	public Integer getR_number() {
		return r_number;
	}

	public void setR_number(Integer r_number) {
		this.r_number = r_number;
	}
	public String getR_date() {
		return r_date;
	}
	public void setR_date(String r_date) {
		this.r_date = r_date;
	}
	public Integer getShow_number() {
		return show_number;
	}
	public void setShow_number(Integer show_number) {
		this.show_number = show_number;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPaycode() {
		return paycode;
	}
	public void setPaycode(String paycode) {
		this.paycode = paycode;
	}
	public Integer getOnline_pay() {
		return online_pay;
	}
	public void setOnline_pay(Integer online_pay) {
		this.online_pay = online_pay;
	}
	
	
}
