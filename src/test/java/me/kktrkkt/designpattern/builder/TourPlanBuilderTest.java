package me.kktrkkt.designpattern.builder;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TourPlanBuilderTest {

    @Test
    public void build_test() {
        TourPlanBuilder builder = new DefaultTourPlanBuilder();
        TourPlan plan = builder.title("오레곤 롱비치 여행")
                .startDate(LocalDate.of(2021, 7, 15))
                .build();

        assertEquals("오레곤 롱비치 여행", plan.getTitle());

        builder = new DefaultTourPlanBuilder();
        TourPlan plan2 = builder.title("칸쿤 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2020, 12, 9))
                .whereToStay("리조트")
                .addPlan(0, "체크인 이후 짐풀기")
                .addPlan(0, "저녁 식사")
                .addPlan(1, "조식 부페에서 식사")
                .addPlan(1, "해변가 산책")
                .addPlan(1, "점심은 수영장 근처 음식점에서 먹기")
                .addPlan(1, "저녁은 BBQ 식당에서 스테이크")
                .addPlan(2, "조식 부페에서 식사")
                .addPlan(2, "체크아웃")
                .addPlan(1, "리조트 수영장에서 놀기")
                .build();

        assertEquals("칸쿤 여행", plan2.getTitle());
    }

}