public class Fact {
    public static void main(String[] args){
        int x = 8;
        Fact a = new Fact();
        System.out.println(a.fact(x));
        String y = "ya";
        System.out.println(y.substring(1));
    }
    public int fact(int n){
        if(n==0){
            return 1;/*Base case.*/
        }
        return n * fact(n-1);/*Recursive step;n!=n*(n−1)!*/
    }

}
