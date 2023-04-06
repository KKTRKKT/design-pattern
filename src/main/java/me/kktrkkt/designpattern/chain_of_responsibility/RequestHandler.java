package me.kktrkkt.designpattern.chain_of_responsibility;

public class RequestHandler {

    public void handler(Request request) {
        System.out.println(request.getBody());
    }
}
