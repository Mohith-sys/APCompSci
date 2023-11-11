import java.util.ArrayList;

import static java.lang.Math.round;

public class Test {
    public static void main(String[] args){
        Ax t = new Ax();
        t.show(36);

        double x = 0;
        x++;
        System.out.println(x);

        int y = 41;
        System.out.println("hey" + y * 2);
    }

}

class Tool{
    public void show(int n){
        System.out.println(n/10);
    }
}

class Ax extends Tool{
    public void show(double n){
        System.out.println(n/10);
    }
}