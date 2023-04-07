package me.kktrkkt.designpattern.command;

public class MyApp {

    private final Command command;

    public MyApp(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public static void main(String[] args) {
        MyApp myApp = new MyApp(new GameStartCommand(new Game()));
        myApp.press();
        myApp.press();
        myApp.press();
        myApp.press();
    }
}
