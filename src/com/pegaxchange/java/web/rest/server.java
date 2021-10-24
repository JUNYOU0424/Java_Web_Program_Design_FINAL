package com.pegaxchange.java.web.rest;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

import java.util.*;
import com.pegaxchange.java.web.model.good;
import com.pegaxchange.java.web.model.connect;
import com.google.gson.*;
@Path("good")
public class server {
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String goods() { 
	    String goods = null; 
	    ArrayList<good> goodlist = new ArrayList<good>(); 
	    try { 
	     goodlist = new connect().getgood(); 
	     Gson gson = new Gson(); 
	     goods = gson.toJson(goodlist); 
	    } catch (Exception e) { 
	     e.printStackTrace(); 
	    } 
	    return goods; 
	}
	
	@POST
	@Path("add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public good addgood(good goods) {
		System.out.println(goods);
	    String name = goods.getname();
	    int price = goods.getprice();
	    
	    System.out.println("First name = " + name);
	    System.out.println("Last name = " + price);
	    return goods;
	}
	@POST
	@Path("addd")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String post(String jsonRequest) {
		Gson gson = new Gson(); 
		String json = gson.toJson(jsonRequest);
		System.out.print(jsonRequest);
		good goodlist = gson.fromJson(jsonRequest, good.class);
		System.out.println(goodlist);
		System.out.println(goodlist.getname());
		System.out.println(goodlist.gettype());
		System.out.println(goodlist.getprice());
		System.out.println(goodlist.getnums());
		System.out.println(goodlist.getid());
		System.out.println(goodlist.getdepartment());
	    return json;
	}
}

