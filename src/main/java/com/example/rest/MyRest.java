package com.example.rest;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by yangyu on 17/1/11.
 */
@Component
@Path("myrest")
public class MyRest {

    @GET
    @Path("name")
    @Produces(MediaType.TEXT_PLAIN)
    public String test(){
        return "got it";
    }
}
