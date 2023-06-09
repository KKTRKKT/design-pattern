package me.kktrkkt.designpattern.chain_of_responsibility;

public class LoggingRequestHandler extends RequestHandler {

    public LoggingRequestHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handler(Request request) {
        System.out.println("로깅");
        super.handler(request);
    }
}
