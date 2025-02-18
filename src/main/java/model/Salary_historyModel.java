package model;

public class Salary_historyModel {
	public Salary_historyModel(String employee_id, String year, String month, int price) {
		super();
		this.employee_id = employee_id;
		this.year = year;
		this.month = month;
		this.price = price;
	}
	public String employee_id;
	public String year;
	public String month;
	public int price;
	
	public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
