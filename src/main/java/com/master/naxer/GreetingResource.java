package com.master.naxer;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/printString")
public class GreetingResource {

    @Inject
    TextService textService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return this.textService.getString();
    }
}
