package javahandler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class RSHJavaHandler implements RequestStreamHandler {
    @Override
    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
        String name;
        try (Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8.name())) {
            name = scanner.useDelimiter("\\A").next();
        }
        outputStream.write(("Hello " + name + "!").getBytes());
    }
}
