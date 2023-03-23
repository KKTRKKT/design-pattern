package me.kktrkkt.designpattern.builder;

import java.time.LocalDate;

public interface TourPlanBuilder {
    TourPlanBuilder title(String title);

    TourPlanBuilder startDate(LocalDate startDate);

    TourPlan build();

    TourPlanBuilder nightsAndDays(int nights, int days);

    TourPlanBuilder whereToStay(String stay);

    TourPlanBuilder addPlan(int day, String plan);
}
