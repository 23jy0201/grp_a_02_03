package dao;

import java.sql.Connection;

public class DAO {
	 private Connection con;

	    public ProductDAO(Connection con) {
	        this.con = con;
	    }
}
