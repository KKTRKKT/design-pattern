package me.kktrkkt.designpattern.bridge;

import org.junit.jupiter.api.Test;

class ChampionTest {

    @Test
    void move_test() {
        new 아리(new KDA()).move();
        new 아칼리(new KDA()).move();
        new 카이사(new KDA()).move();
        new 아리(new PoolParty()).move();
        new 아칼리(new PoolParty()).move();
        new 카이사(new PoolParty()).move();
    }

    @Test
    void skillQ_test() {
        new 아리(new KDA()).skillQ();
        new 아칼리(new KDA()).skillQ();
        new 카이사(new KDA()).skillQ();
        new 아리(new PoolParty()).skillQ();
        new 아칼리(new PoolParty()).skillQ();
        new 카이사(new PoolParty()).skillQ();
    }

    @Test
    void skillW_test() {
        new 아리(new KDA()).skillW();
        new 아칼리(new KDA()).skillW();
        new 카이사(new KDA()).skillW();
        new 아리(new PoolParty()).skillW();
        new 아칼리(new PoolParty()).skillW();
        new 카이사(new PoolParty()).skillW();
    }

    @Test
    void skillE_test() {
        new 아리(new KDA()).skillE();
        new 아칼리(new KDA()).skillE();
        new 카이사(new KDA()).skillE();
        new 아리(new PoolParty()).skillE();
        new 아칼리(new PoolParty()).skillE();
        new 카이사(new PoolParty()).skillE();
    }

    @Test
    void skillR_test() {
        new 아리(new KDA()).skillR();
        new 아칼리(new KDA()).skillR();
        new 카이사(new KDA()).skillR();
        new 아리(new PoolParty()).skillR();
        new 아칼리(new PoolParty()).skillR();
        new 카이사(new PoolParty()).skillR();
    }
}