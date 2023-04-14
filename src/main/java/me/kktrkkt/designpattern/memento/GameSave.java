package me.kktrkkt.designpattern.memento;

public final class GameSave {
    private final int redTeamScore;
    private final int blueTeamScore;

    public GameSave(int redTeamScore, int blueTeamScore) {
        this.redTeamScore = redTeamScore;
        this.blueTeamScore = blueTeamScore;
    }


    public int getRedTeamScore() {
        return redTeamScore;
    }

    public int getBlueTeamScore() {
        return blueTeamScore;
    }
}
