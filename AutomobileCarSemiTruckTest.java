// Mohith, Keerat, Emmanuel
public class AutomobileCarSemiTruckTest {
    public static void main(String[] args){
        Car toyota = new Car("2019 Toyota Camry", "ABC123", "Blue", 5, 3231);
        SemiTruck volvo = new SemiTruck("Volvo VT880", "XYZ789", "Red", 10, 10000);

        System.out.println(toyota.getNumSeats());
        toyota.printColor();
        System.out.println(toyota.toString());
        System.out.println(toyota.getWeight());

        System.out.println(volvo.toString());
        System.out.println(volvo.getWeight());
        System.out.println(volvo.getNumWheels());
        volvo.printColor();
    }
}
