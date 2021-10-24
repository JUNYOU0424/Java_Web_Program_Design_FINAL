package com.pegaxchange.java.web.rest;
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("restservice")
public class service extends ResourceConfig{
	public service() {
		packages("com.fasterxml.jackson.jaxrs.json");
		packages("com.pegaxchange.java.web.rest");
	}
}
