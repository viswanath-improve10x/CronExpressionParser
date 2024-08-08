package com.viswanath.cronexpparser;

import java.util.List;
import java.util.Objects;

public class CronExpressionData {
    public List<Integer> minutes; // 0 - 59
    public List<Integer> hours; // 0 - 11
    public List<Integer> daysOfMonth; // 1 to 31
    public List<Integer> months; // 1 - 12
    public List<Integer> daysOfWeek; // 1 - 7

    public CronExpressionData() {}

    public CronExpressionData(List<Integer> minutes, List<Integer> hours, List<Integer> daysOfMonth, List<Integer> months, List<Integer> daysOfWeek) {
        this.minutes = minutes;
        this.hours = hours;
        this.daysOfMonth = daysOfMonth;
        this.months = months;
        this.daysOfWeek = daysOfWeek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CronExpressionData that = (CronExpressionData) o;
        return Objects.equals(minutes, that.minutes)
                && Objects.equals(hours, that.hours)
                && Objects.equals(daysOfMonth, that.daysOfMonth)
                && Objects.equals(months, that.months)
                && Objects.equals(daysOfWeek, that.daysOfWeek);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minutes, hours, daysOfMonth, months, daysOfWeek);
    }
}
