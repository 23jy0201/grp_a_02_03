package model;

public class StoreModel {
	public StoreModel(String store_id, String store_name, String store_frigana, String store_address,
			String store_postal_code, String store_phone_number) {
		super();
		this.store_id = store_id;
		this.store_name = store_name;
		this.store_frigana = store_frigana;
		this.store_address = store_address;
		this.store_postal_code = store_postal_code;
		this.store_phone_number = store_phone_number;
	}
	public String store_id;
	public String store_name;
	public String store_frigana;
	public String store_address;
	public String store_postal_code;
	public String store_phone_number;
	
	public String getStore_id() {
		return store_id;
	}
	public void setStore_id(String store_id) {
		this.store_id = store_id;
	}
	public String getStore_name() {
		return store_name;
	}
	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}
	public String getStore_frigana() {
		return store_frigana;
	}
	public void setStore_frigana(String store_frigana) {
		this.store_frigana = store_frigana;
	}
	public String getStore_address() {
		return store_address;
	}
	public void setStore_address(String store_address) {
		this.store_address = store_address;
	}
	public String getStore_postal_code() {
		return store_postal_code;
	}
	public void setStore_postal_code(String store_postal_code) {
		this.store_postal_code = store_postal_code;
	}
	public String getStore_phone_number() {
		return store_phone_number;
	}
	public void setStore_phone_number(String store_phone_number) {
		this.store_phone_number = store_phone_number;
	}
	
	
}
