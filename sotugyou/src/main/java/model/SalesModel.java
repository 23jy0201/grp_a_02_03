package model;

public class SalesModel {
	public SalesModel(String sales_weekday, int sales_start_time, int sales_end_time, String store_id) {
		super();
		this.sales_weekday = sales_weekday;
		this.sales_start_time = sales_start_time;
		this.sales_end_time = sales_end_time;
		this.store_id = store_id;
	}
	public String sales_weekday;
	public int sales_start_time;
	public int sales_end_time;
	public String store_id;
	
	public String getSales_weekday() {
		return sales_weekday;
	}
	public void setSales_weekday(String sales_weekday) {
		this.sales_weekday = sales_weekday;
	}
	public int getSales_start_time() {
		return sales_start_time;
	}
	public void setSales_start_time(int sales_start_time) {
		this.sales_start_time = sales_start_time;
	}
	public int getSales_end_time() {
		return sales_end_time;
	}
	public void setSales_end_time(int sales_end_time) {
		this.sales_end_time = sales_end_time;
	}
	public String getStore_id() {
		return store_id;
	}
	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}
	
	
}
