/*Question #3 parts a, b, and c
Mohith Nagendra
3/9/2022*/
public class Rectangle {
    private int width, height;
    // part a
    public Rectangle(int w, int h){
        width = w;
        height = h;
    }
    public Rectangle(int l){
        width = l;
        height = l;
    }
    public Rectangle(){
        width = 1;
        height = 1;
    }
    // part b
    public boolean isSquare(){
        if(width == height)
            return true;
        return false;
    }
    public void quadratize(){
        width = (int) (Math.sqrt(width*height) + 0.5);
        height = width;
    }
    // part c
    public String toString(){
        return "Width: " + width + " Height: " + height;
    }
}