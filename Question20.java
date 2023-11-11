/**
 * Question 20 book work
 *
 * Mohith Nagendra
 * 2/3/2022
 */
public class Question20
{
    public static void main(String[] args){
        // testing
        int[][] z = pascalTriangle(4);
        for(int[] r : z){
            for(int c : r){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
    public static int[][] pascalTriangle(int n){
        int[][] x = new int[n+1][n+1];
        for (int i = 0; i < n + 1; i++){
            x[i][0] = 1;
            for (int j = 1; j <= i; j++){
                x[i][j] = x[i-1][j] + x[i-1][j-1];
            }
        }
        return x;
    }
}
