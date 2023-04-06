package me.kktrkkt.designpattern.chain_of_responsibility;

public abstract class RequestHandler {

    private final RequestHandler nextHandler;

    protected RequestHandler (RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handler(Request request) {
        if(nextHandler != null){
            nextHandler.handler(request);
        }
    }
}
