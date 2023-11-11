// Mohith, Keerat, Emmanuel
public class SemiTruck extends Automobile {
    private int numWheels;
    private String color;
    private double weight;

    public SemiTruck(String m, String l, String c, int n, double w){
        super(m,l);
        color = c;
        numWheels = n;
        weight = w;
    }

    public void printColor(){
        System.out.println(color);
    }

    public double getWeight(){
        return weight;
    }

    public int getNumWheels(){
        return numWheels;
    }

    public String toString(){
        return "SemiTruck: " + super.toString();
    }
}
