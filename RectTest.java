/*Question #3d
Mohith Nagendra
3/9/2022*/
public class RectTest {
    public static void main(String[] args){
        Rectangle x = new Rectangle(3);
        Rectangle y = new Rectangle(7,9);
        Rectangle z = new Rectangle();

        System.out.println(x.isSquare());
        System.out.println(z.toString());
        System.out.println(y.toString());
        y.quadratize();
        System.out.println(y.toString());
    }

}
