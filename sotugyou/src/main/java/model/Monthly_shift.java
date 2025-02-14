package model;

public class Monthly_shift {
	public Monthly_shift(String year, String month, String store_id, Boolean public_flag) {
		super();
		this.year = year;
		this.month = month;
		this.store_id = store_id;
		this.public_flag = public_flag;
	}
	public String year;
	public String month;
	public String store_id;
	public Boolean public_flag;
	
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
	public String getStore_id() {
		return store_id;
	}
	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}
	public Boolean getPublic_flag() {
		return public_flag;
	}
	public void setPublic_flag(Boolean public_flag) {
		this.public_flag = public_flag;
	}
	
	
}
