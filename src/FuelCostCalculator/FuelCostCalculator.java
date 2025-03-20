package FuelCostCalculator;


//importing the Scanner class to take input from the user
import java.util.Scanner;


public class FuelCostCalculator {
    
        
    public static void main(String[] args) {
  //creating an instance of the scanner class      
    Scanner input = new Scanner(System.in);
    
        System.out.println("total distance of the trip in kilometers");
        int kilometers = input.nextInt();
        
        System.out.println("fuel efficiency of their car (km per liter)");
        double fuelEfficiency = input.nextDouble();
        
        System.out.println("price of fuel per liter");
        double price = input.nextDouble();
        
        
        //formula
        
         double fuelNeeded = kilometers/fuelEfficiency;
         
        double costOfFuel = fuelNeeded * price;
        
        System.out.println("The total amount of Fuel is " + costOfFuel);

// closing the scanner
         input.close();
    }
    
}
