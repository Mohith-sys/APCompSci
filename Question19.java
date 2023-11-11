/**
 * Question 19 book work
 *
 * Mohith Nagendra
 * 2/3/2022
 */
public class Question19
{
    public static void main(String[] args){
        // testing part a
        String[] x = allSubstrings("cat");
        for(String ele: x){
            System.out.print(ele + " ");
        }
        System.out.println("---");
        // testing part b
        String[] y = {
            "cat", "bat", "mat"
        };
        String[][] z = partb(y);
        for(String[] r : z){
            for(String c : r){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
    // part a
    public static String[] allSubstrings(String x){
        int n = (x.length()*(x.length() + 1))/2;
        String[] z = new String[n];
        int u = 0;
        for(int i = 0; i < x.length(); i++){
            for(int y = i; y < x.length(); y++){
                z[u] = x.substring(i, y+1);
                u++;
            }
        }
        return z;
    }
    // part b
    public static String[][] partb(String[] words){
        String[][] x = new String[words.length][];
        for(int i = 0; i < words.length; i++){
            x[i] = allSubstrings(words[i]);
        }
        return x;
    }
}
