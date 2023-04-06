package me.kktrkkt.designpattern.chain_of_responsibility;

public class Client {

    public static void main(String[] args) {
        Request request = new Request("무궁화 꽃이 피었습니다.");
        RequestHandler requestHandler = new AuthRequestHandler(new LoggingRequestHandler(new DefaultRequestHandler(null)));
        requestHandler.handler(request);
    }
}
