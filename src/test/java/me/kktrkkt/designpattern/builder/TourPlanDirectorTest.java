package me.kktrkkt.designpattern.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TourPlanDirectorTest {
    @Test
    public void build_test() {
        TourPlanDirector tourPlanDirector = new TourPlanDirector(new DefaultTourPlanBuilder());
        TourPlan cancunPlan = tourPlanDirector.cancunTrip();

        assertEquals("칸쿤 여행", cancunPlan.getTitle());

        TourPlan longBeachPlan = tourPlanDirector.longBeachPlan();

        assertEquals("오레곤 롱비치 여행", longBeachPlan.getTitle());
    }
}
