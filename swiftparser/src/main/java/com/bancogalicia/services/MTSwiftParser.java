package com.bancogalicia.services;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import com.prowidesoftware.swift.model.mt.mt1xx.MT103;

@Path("/")
public class MTSwiftParser {
	@GET
	@Produces("text/html")
	public Response getData() 
	{
		return Response.status(200).entity("Hola Mundo").build();
	}
	
	@POST
	public String parseMessage(String message)
	{
		return new MT103(message).toJson();
	}
	
}
