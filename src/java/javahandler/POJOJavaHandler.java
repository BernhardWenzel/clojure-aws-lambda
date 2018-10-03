package javahandler;

import com.amazonaws.services.lambda.runtime.Context;

public class POJOJavaHandler {
    public Response myHandler(Request input, Context context) {
        final Response response = new Response();
        response.setHello("Hello " + input.getFirstName() + " " + input.getLastName() +"!");
        return response;
    }
}

