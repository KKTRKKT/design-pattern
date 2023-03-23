package me.kktrkkt.designpattern.builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DefaultTourPlanBuilder implements TourPlanBuilder {

    private final List<DetailPlan> plans;
    private String title;
    private LocalDate startDate;
    private int nights;
    private int days;
    private String whereToStay;

    public DefaultTourPlanBuilder() {
        this.plans = new ArrayList<>();
        this.title = "";
        this.startDate = LocalDate.now();
        this.nights = 0;
        this.days = 0;
        whereToStay = "";
    }

    @Override
    public TourPlanBuilder title(String title) {
        this.title = title;
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    @Override
    public TourPlan build() {
        return new TourPlan(this.title, this.nights, this.days, this.startDate, this.whereToStay, this.plans);
    }

    @Override
    public TourPlanBuilder nightsAndDays(int nights, int days) {
        this.nights = nights;
        this.days = days;
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        this.whereToStay = whereToStay;
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        this.plans.add(new DetailPlan(day, plan));
        return this;
    }
}
