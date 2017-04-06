package com.example.rest;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Path;

/**
 * Created by yangyu on 17/1/11.
 */
@Component
@ApplicationPath("rest")
public class MyConfig extends ResourceConfig{
    public MyConfig(){
        register(MyRest.class);
    }
}
