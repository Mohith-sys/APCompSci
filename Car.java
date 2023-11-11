// Mohith, Keerat, Emmanuel
public class Car extends Automobile {
    private String color;
    private int numSeats;
    private double weight;

    public Car(String m, String l, String c, int n, double w){
        super(m,l);
        color = c;
        numSeats = n;
        weight = w;
    }

    public void printColor(){
        System.out.println(color);
    }

    public int getNumSeats(){
        return numSeats;
    }

    public double getWeight(){
        return weight;
    }

    public String toString(){
        return "Car: " + super.toString();
    }
}
