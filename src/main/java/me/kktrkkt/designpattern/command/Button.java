package me.kktrkkt.designpattern.command;

import java.util.Stack;

public class Button {

    private final Stack<Command> commandStack;

    public Button() {
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
        Button button = new Button();
        button.press(new LightOnCommand(new Light()));
        button.press(new LightOnCommand(new Light()));
        button.undo();
        button.undo();
    }
}
