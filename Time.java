/*Question #4 parts a, b, c, d, and e
Mohith Nagendra
3/9/2022*/
public class Time {
    // part a
    private int hours, mins;
    // part b
    public Time(int h, int m){
        if(h <= 23 && h >= 0)
            hours = h;
        if(m <= 59 && m >= 0)
            mins = m;
    }
    // part b
    private int toMins(){
        return (hours * 60) + mins;
    }
    // part c
    public boolean lessThan(Time t){
        if (this.toMins() < t.toMins())
            return true;
        return false;
    }
    // part d
    public int elapsedTime(Time t){
        return (t.toMins() + (24*60)) - this.toMins();
    }
    // part e
    public String toString(){
        return hours + ":" + mins;
    }
}
