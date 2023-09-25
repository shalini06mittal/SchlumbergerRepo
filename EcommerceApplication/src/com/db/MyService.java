package com.db;

public class MyService {

	// database
	//get me all iphones => db layer => database
	// tighly coupled to db objects
	/**
	 * 1. memory consumption
	 * 2. tightly coupled
	 * 3. not extensible
	 * 4. Too much of work done by the service layer
	 */
//	private MySqldDB db = new MySqldDB(); // 
//	private OracleDB db1 = new OracleDB();
//	private RedisDB db3 = new RedisDB();
	
	private DB db;
	
	public MyService(DB db) {
		this.db = db;
		System.out.println("My service");
		db.connect();
	}
	public void getProductsByCategory(String category) {
		// db 
	
	}
}
