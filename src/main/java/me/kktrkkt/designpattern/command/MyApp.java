package me.kktrkkt.designpattern.command;

import java.util.Stack;

public class MyApp {

    private final Stack<Command> commandStack;

    public MyApp() {
        this.commandStack = new Stack<>();
    }

    public void press(Command command) {
        command.execute();
        this.commandStack.push(command);
    }

    public void undo() {
        if(this.commandStack.empty()){
            return;
        }
        this.commandStack.pop().undo();
    }

    public static void main(String[] args) {
        MyApp myApp = new MyApp();
        myApp.press(new GameStartCommand(new Game()));
        myApp.press(new LightOnCommand(new Light()));
        myApp.undo();
        myApp.undo();
    }
}
