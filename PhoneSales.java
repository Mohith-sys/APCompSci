
/**
 * Ask the user to choose a phone from the list of at least 5 phones. You must use one switch-case and one conditional statement.
 * Name of the phone they are purchasing:
 * State where the product is shipped:
 *
 * Sarah Poravanthattil
 * 3/21/22
 */
import java.util.Scanner;
public class PhoneSales
{
    public static void main(String[]args){
        System.out.println("List of phones: iPhone 6, iPhone 7, iPhone 8, iPhone XR, iPhone 13");
        Scanner input = new Scanner(System.in);
        System.out.println("Choose one of the options above: ");
        String phone = input.nextLine();
        System.out.println("What state are you shipping to?(New Jersey;Deleware;Pennsylvania): ");
        String state = input.nextLine();
        double phonecost = 0;
        double tax = 0;
        if(phone.equals("iPhone 6")){
            phonecost = 199.99;
        }
        if (phone.equals("iPhone 7")){
            phonecost = 499.99;
        }
        if (phone.equals("iPhone 8")){
            phonecost = 599.99;
        }
        if (phone.equals("iPhone XR")){
            phonecost = 749.99;
        }
        if (phone.equals("iPhone 13")){
            phonecost = 899.99;
        }
        switch(state){
            case "New Jersey":
                tax = phonecost * 1.06625;
                break;
            case "Pennsylvania":
                tax = phonecost * 1.03;
                break;
            case "Deleware":
                tax = phonecost;
                break;
            default:
                tax = phonecost * 1.075;
        }
        System.out.println("You bought the " + phone + " and it will be shipped to " + state +".");
        System.out.printf("The total cost = $ %.2f%n", tax);
    }
}
