package me.kktrkkt.designpattern.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    public void game_restore_test() {
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        GameSave save = game.save();

        game.setRedTeamScore(31);
        game.setBlueTeamScore(21);

        game.restore(save);

        assertEquals(10, game.getRedTeamScore());
        assertEquals(20, game.getBlueTeamScore());

    }

}