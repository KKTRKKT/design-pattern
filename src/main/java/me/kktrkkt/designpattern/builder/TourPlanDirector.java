package me.kktrkkt.designpattern.builder;

import java.time.LocalDate;

public class TourPlanDirector {
    private final TourPlanBuilder tourPlanBuilder;

    public TourPlanDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan longBeachPlan() {
        return this.tourPlanBuilder.title("오레곤 롱비치 여행")
                .startDate(LocalDate.of(2021, 7, 15))
                .build();
    }

    public TourPlan cancunTrip() {
        return this.tourPlanBuilder.title("칸쿤 여행")
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
    }
}
