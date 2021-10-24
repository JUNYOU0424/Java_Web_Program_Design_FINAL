package com.pegaxchange.java.web.model;
import java.sql.Connection; 
import java.util.ArrayList; 
import db.jdbc;
import db.access;
import com.pegaxchange.java.web.model.good;
public class connect {
	
	public ArrayList<good> getgood() throws Exception {
	    ArrayList<good> goodlist = new ArrayList<good>();
	    jdbc db = new jdbc(); 
	    Connection con = db.getConnection(); 
	    access access = new access();
	    goodlist = access.getgood(con); 
	    return goodlist; 
	} 
	
	
}
