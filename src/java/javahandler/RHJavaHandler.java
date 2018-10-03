package javahandler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class RHJavaHandler implements RequestHandler<Request, Response> {
    @Override
    public Response handleRequest(Request input, Context context) {
        final Response response = new Response();
        response.setHello("Hello " + input.getFirstName() + " " + input.getLastName() +"!");
        return response;
    }
}
