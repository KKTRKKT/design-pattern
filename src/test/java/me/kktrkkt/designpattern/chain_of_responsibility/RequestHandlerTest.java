package me.kktrkkt.designpattern.chain_of_responsibility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequestHandlerTest {

    @Test
    public void handler_test() {
        Request request = new Request("무궁화 꽃이 피었습니다.");
        RequestHandler requestHandler = new AuthRequestHandler(new LoggingRequestHandler(new DefaultRequestHandler(null)));
        requestHandler.handler(request);
    }

}