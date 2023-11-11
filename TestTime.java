/*Question #3f
Mohith Nagendra
3/9/2022*/
public class TestTime {
    // part f
    public static void main(String[] args){
        Time x = new Time(23,50);
        Time y = new Time(1,50);

        System.out.println(x.lessThan(y));
        System.out.println(x.elapsedTime(y));
        System.out.println(x.toString());
    }
}
