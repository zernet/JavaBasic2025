package com.gmail.zernetcsgo.hw15;

public class AdviceApp {
    public static void main(String[] args) {
        Advisor advisor = new WeekdayAdvisor();

        advisor.advise(Day.MONDAY);
        advisor.advise(Day.FRIDAY);
        advisor.advise(Day.SUNDAY);
    }
}
