package com.brainacad.labs.oop.testenum1;

public enum MyDayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static MyDayOfWeek nextDay(MyDayOfWeek day) {
        int dayIndex = day.ordinal();
        MyDayOfWeek[] days =  MyDayOfWeek.values();
        return dayIndex + 1 >= days.length ? days[0] : days[dayIndex + 1];
    }
}
