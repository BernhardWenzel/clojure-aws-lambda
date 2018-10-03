package javahandler;

public class Response {

    public Response(){}

    public Response(String hello) {

        this.hello = hello;
    }

    private String hello;

    public String getHello() {

        return hello;
    }

    public void setHello(String hello) {

        this.hello = hello;
    }
}
