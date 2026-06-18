class Solution {
    public double angleClock(int hour, int minutes) {
        double m = minutes * 6.0;
        if(hour == 12) hour = 0;
        double h = hour * 30.0 + minutes  * 0.5;
        double diff = Math.abs(h - m);
        return Math.min(diff, 360.0 - diff);
    }
}