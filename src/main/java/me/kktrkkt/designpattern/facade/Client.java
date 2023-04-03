package me.kktrkkt.designpattern.facade;

public class Client {

    public static void main(String[] args) {
        String to = "kktrkkt@kktrkkt.me";
        String from = "kktrkkt@kktrkkt.me";
        String subject = "Test Mail from Java Program";
        String text = "message";
        String host = "127.0.0.1";

        EmailFacade.send(to, from, subject, text, host);
    }

}
