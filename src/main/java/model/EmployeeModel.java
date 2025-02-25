package model;

import login.sha1changer;

public class EmployeeModel {
	sha1changer sha1=new sha1changer();
	
	
	public EmployeeModel(String employee_id, String store_id, String employee_name, String furigana, String birthdate,
			String address, String postal_code, String email_address, String phone_number, String employee_password) {
		super();
		this.employee_id = employee_id;
		this.store_id = store_id;
		this.employee_name = employee_name;
		this.furigana = furigana;
		this.birthdate = birthdate;
		this.address = address;
		this.postal_code = postal_code;
		this.email_address = email_address;
		this.phone_number = phone_number;
		this.employee_password = employee_password;
	}
	public EmployeeModel(String employeeName, String furigana, String birthdate, 
            String address, String postalCode, String emailAddress, String phoneNumber) {
		this.employee_name = employeeName;
		this.furigana = furigana;
		this.birthdate = birthdate;
		this.address = address;
		this.postal_code = postalCode;
		this.email_address = emailAddress;
		this.phone_number = phoneNumber;
	}
	private String employee_id;
	private String store_id;
	private String employee_name;
	private String furigana;
	private String birthdate;
	private String address;
	private String postal_code;
	private String email_address;
	private String phone_number;
	private String employee_password;
	
	
	
	public String getEmployee_password() {
		return employee_password;
	}
	public void setEmployee_password(String employee_password) {
		this.employee_password = employee_password;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public void setFurigana(String furigana) {
		this.furigana = furigana;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmployee_id() {
		return employee_id;
	}
	public String getStore_id() {
		return store_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public String getFurigana() {
		return furigana;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public String getAddress() {
		return address;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public String getEmail_address() {
		return email_address;
	}
	public String getPhone_number() {
		return phone_number;
	}
}