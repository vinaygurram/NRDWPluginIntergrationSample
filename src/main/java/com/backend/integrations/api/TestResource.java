package com.backend.integrations.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Test Resource
 */
@Path("/test")
public class TestResource {
    private Boolean status;

    public TestResource(boolean status) {
        this.status = status;
    }

    @GET
    public String sayHello() {
        if(status) {
            return "Hello, Have a nice day!";
        }
        return  "hello";
    }
}
