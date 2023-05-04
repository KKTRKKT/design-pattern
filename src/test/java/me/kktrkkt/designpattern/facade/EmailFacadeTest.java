package me.kktrkkt.designpattern.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailFacadeTest {

    @Test
    public void send_test() {
        String to = "kktrkkt@kktrkkt.me";
        String from = "kktrkkt@kktrkkt.me";
        String subject = "Test Mail from Java Program";
        String text = "message";
        String host = "127.0.0.1";

        EmailFacade.send(to, from, subject, text, host);
    }

}