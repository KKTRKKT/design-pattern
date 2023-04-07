package me.kktrkkt.designpattern.command;

public class GameStartCommand implements Command {
    private final Game game;

    public GameStartCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        this.game.start();
    }

    @Override
    public void undo() {
        this.game.end();
    }
}
