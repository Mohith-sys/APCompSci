/**
 * Class to test the robot class
 *
 * @Mohith Nagendra, Emmanuel Leo, Keerat Singh Dev
 * @2/10/22
 */
public class RobotTest
{
    public static void main(String[] args){
        int[][] living = {{1,1,2},
                    {2,0,1},
                    {1,2,1} };
        Robot r = new Robot(living,true, 0, 0); // creating robot r which will have to clean 2D array living
        int moves = r.cleanRoom(); // robot r will clean the "living" room
        System.out.println("Number of moves to clean: " + moves); // prints out number of moves it took robot r to clean the room
        
    }
}