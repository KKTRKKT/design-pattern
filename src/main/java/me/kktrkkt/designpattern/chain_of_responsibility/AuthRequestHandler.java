package me.kktrkkt.designpattern.chain_of_responsibility;

public class AuthRequestHandler extends RequestHandler {

    public AuthRequestHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    public void handler(Request request) {
        System.out.println("인증이 되었나?");
        System.out.println("이 핸들러를 사용할 수 있는 유저인가?");
        super.handler(request);
    }
}
