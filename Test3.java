public class Test3 {
    public static void main(String args[]){
        Test3 a = new Test3();
        int z = a.maximum(6,3);
        System.out.println(z);
    }
    public int maximum(int x,int y){
        if(x >= y){
            return x;
        }
        else {
            return y;
        }
    }
}
