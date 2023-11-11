import java.util.HashMap;

public class List {
    public static void main(String[] args) {
        HashMap<Integer,Integer> bag= new HashMap<>();

        bag.put(1,131);
        bag.put(2,132);
        bag.put(3,132);


        bag.remove(1);
        System.out.println(bag.containsValue(131));
        x = 1 + null;
        System.out.println(x);
    }
}
