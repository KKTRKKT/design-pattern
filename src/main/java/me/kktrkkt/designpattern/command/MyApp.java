package me.kktrkkt.designpattern.command;

public class MyApp {

    private Game game;

    public MyApp(Game game) {
        this.game = game;
    }

    public void press() {
        game.start();
    }

    public static void main(String[] args) {
        MyApp myApp = new MyApp(new Game());
        myApp.press();
        myApp.press();
        myApp.press();
        myApp.press();
    }
}
