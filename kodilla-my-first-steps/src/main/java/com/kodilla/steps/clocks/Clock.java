package com.kodilla.steps.clocks;

import java.time.LocalTime;

class Clock {

    public LocalTime time;

    public Clock(int hour, int minute) {
        this.time = LocalTime.of(hour, minute);
    }

    public LocalTime addMinute() {
        return time.plusMinutes(1);
    }

    @Override
    public String toString() {
        return time.toString();
    }

    @Override
    public int hashCode() {
        return time.hashCode() * 19;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj instanceof Clock) {
            Clock otherObj = (Clock) obj;
            return this.time == otherObj.time;
        }
        return false;
    }

    // 2 wersja:
    public LocalTime getTime() {
        return this.time;
    }
}
