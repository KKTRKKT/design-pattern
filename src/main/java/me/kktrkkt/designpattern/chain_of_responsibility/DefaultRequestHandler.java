package me.kktrkkt.designpattern.chain_of_responsibility;

public class DefaultRequestHandler extends RequestHandler {

    public DefaultRequestHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    public void handler(Request request) {
        System.out.println(request.getBody());
        super.handler(request);
    }
}
