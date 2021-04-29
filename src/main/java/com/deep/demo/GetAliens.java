package com.deep.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class GetAliens {
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Aliens getAliensDetails() {
		Aliens a=new Aliens();
		a.setMame("Rohit");
		a.setPoints(100);
		return a;
	}

}

