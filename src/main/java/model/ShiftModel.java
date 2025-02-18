package model;

public class ShiftModel {
	public ShiftModel(String shift_id, String working_date, int working_times, String year, String month,
			String store_id) {
		super();
		this.shift_id = shift_id;
		this.working_date = working_date;
		this.working_times = working_times;
		this.year = year;
		this.month = month;
		this.store_id = store_id;
	}
	public String shift_id;
	public String working_date;
	public int working_times;
	public String year;
	public String month;
	public String store_id;
	
	public String getShift_id() {
		return shift_id;
	}
	public void setShift_id(String shift_id) {
		this.shift_id = shift_id;
	}
	public String getWorking_date() {
		return working_date;
	}
	public void setWorking_date(String working_date) {
		this.working_date = working_date;
	}
	public int getWorking_times() {
		return working_times;
	}
	public void setWorking_times(int working_times) {
		this.working_times = working_times;
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
	public String getStore_id() {
		return store_id;
	}
	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}
	
	
	
}
