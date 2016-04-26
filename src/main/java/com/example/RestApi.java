package com.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by ERL1 on 4/26/2016.
 */
@Path("/api")
public class RestApi {
    @GET
    @Path("/message")
    @Produces("text/html")
    public String getMessage(){
        System.out.println("sayHello()");
        return "Hello, world!";
    }

    @GET
    @Path("/testget")
    @Produces("application/json")
    public Response getTest(){
        TestJSon testJSon = new TestJSon("John", "Smith");

        Gson json = GsonFactory.getGson();
        return Response.status(200).entity(json.toJson(testJSon)).build();
    }

    @POST
    @Path("/testpost/{param}")
    @Produces("application/json")
    public Response postMsg(@PathParam("param") String msg) {
        String output = "POST:Jersey say : " + msg;
        return Response.status(200).entity(output).build();
    }
}
