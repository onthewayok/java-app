package com.wangwenjun.java;

import com.wangwenjun.java.pojo.Greeting;
import com.wangwenjun.java.transformer.JsonTransformer;

import static spark.Spark.*;

/**
 * The Routers class is enter of application, it will startup the restful server and publish resource path.
 */
public class Routers
{
    /**
     * Spark uses filters to intercept any route, lets add a filter for "before" we need to register a Filter that sets the JSON Content-Type.
     */
    static void establishRoutes()
    {
        port(19999);

        before((request, response) -> response.type("application/json"));

        //Route to greeting
        get("/greeting", (request, response) -> new Greeting(1, "Hello, World!"), new JsonTransformer());
        post("/greeting", (request, response) -> new Greeting(2, "Hello I'm Adding, " + request.queryParams("name")), new JsonTransformer());
        put("/greeting", (request, response) -> new Greeting(3, "Hello I'm Updating, " + request.queryParams("name")), new JsonTransformer());
        delete("/greeting", (request, response) -> new Greeting(4, "Hello I'm Deleting, " + request.queryParams("name")), new JsonTransformer());
    }

    public static void main(String[] args)
    {
        establishRoutes();
    }
}