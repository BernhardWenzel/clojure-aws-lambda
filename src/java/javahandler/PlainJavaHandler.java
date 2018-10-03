package javahandler;

import com.amazonaws.services.lambda.runtime.Context;


public class PlainJavaHandler {
    public String myHandler(String input, Context context) {
        return String.valueOf("Hello " + input +"!");
    }
}

