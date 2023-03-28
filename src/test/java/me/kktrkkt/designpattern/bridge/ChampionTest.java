package me.kktrkkt.designpattern.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChampionTest {

    @Test
    void move_test() {
        new KDA아리().move();
        new KDA아칼리().move();
        new KDA카이사().move();
        new PoolParty아리().move();
        new PoolParty아칼리().move();
        new PoolParty카이사().move();
    }

    @Test
    void skillQ_test() {
        new KDA아리().skillQ();
        new KDA아칼리().skillQ();
        new KDA카이사().skillQ();
        new PoolParty아리().skillQ();
        new PoolParty아칼리().skillQ();
        new PoolParty카이사().skillQ();
    }

    @Test
    void skillW_test() {
        new KDA아리().skillW();
        new KDA아칼리().skillW();
        new KDA카이사().skillW();
        new PoolParty아리().skillW();
        new PoolParty아칼리().skillW();
        new PoolParty카이사().skillW();
    }

    @Test
    void skillE_test() {
        new KDA아리().skillE();
        new KDA아칼리().skillE();
        new KDA카이사().skillE();
        new PoolParty아리().skillE();
        new PoolParty아칼리().skillE();
        new PoolParty카이사().skillE();
    }

    @Test
    void skillR_test() {
        new KDA아리().skillR();
        new KDA아칼리().skillR();
        new KDA카이사().skillR();
        new PoolParty아리().skillR();
        new PoolParty아칼리().skillR();
        new PoolParty카이사().skillR();
    }
}