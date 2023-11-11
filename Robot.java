/**
 * Cleaning robot which will go through a 2D array and clean all the objects
 * in each element of the array. The location of the the robot within the array
 * is printed in the format (row, column) and the total amount of moves will be
 * printed out.
 *
 * @Mohith Nagendra, Emmanuel Leo, Keerat Singh Dev
 * @2/7/22
 */
public class Robot
{
    // instance variables
    private int[][] room;
    private boolean facingRight; // true if the robot is facing right and false if robot is not
    private int r; // row position of cleaning robot
    private int c; // column position of cleaning robot

    public Robot(int [][] h, boolean fr, int x, int y){ // Keerat - constructor
        room = h;
        facingRight = fr;
        r = x;
        c = y;
    }

    private boolean forwardMoveBlocked() { // Emmanuel & Keerat - method checking to see if forward move is blocked
        if (facingRight && c >= room[0].length - 1) {
            return true;
        }
        else if (!facingRight && c == 0) {
            return true;
        }
        return false;
    }

    public int cleanRoom() { // Mohith - method to clean the 2D array
        int count = 0; // variable to keep track of number of moves taken by the robot
        if (!roomIsClear()) { // checking to see if rooms not clear
            for(int x = 0; x < room.length; x++){
                for(int y = 0; y < room[0].length; y++){
                    if(room[x][y] == 0){
                        System.out.println(x + ", " + y); // will keep track of the position of the robot in the array
                        if(forwardMoveBlocked() == true){ // checking to see if robot can move forward
                            facingRight = !facingRight; // turns the robot
                        }
                        count++; 
                    }
                    while(room[x][y] != 0){ // while statement so that as long as there are objects in the element the robot will remove one object at a time and add a move to the total
                        System.out.println(x + ", " + y);
                        room[x][y]--;
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private boolean roomIsClear() { // Mohith - method to check if the 2D array is cleared
        boolean clean = false; // initializing clean variable to false
        int garbage = 0; // variable to keep track of total objects in the 2D array
        for(int x = 0; x < room.length; x++){
            for(int y = 0; y < room[0].length; y++){
                garbage += room[x][y];
            }
        }
        // for loop above will go through each element of the 2D array and add up the objects
        if(garbage == 0)
            clean = true; // means that if there's no more objects the room is clean
        return clean;
    }
    // Emmanuel and Keerat also did the poster themselves
}