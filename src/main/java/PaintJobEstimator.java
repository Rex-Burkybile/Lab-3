
import java.text.NumberFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

//A painting company has determined that for every 115 square feet of wall space,
//one gallon of paint and eight hours of labor will be required.
//The company charges $18.00 per hour for labor.
//Write a program that allows the user to enter the number of rooms to be painted
//and the price of the paint per gallon. 
//It should also ask for the square feet of wall space in each room.
//The program should have methods that return the following data:

//The number of gallons of paint required
//The hours of labor required
//The cost of the paint
//The labor charges
//The total cost of the paint job
//Then it should display the data on the screen
public class PaintJobEstimator {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner (System.in);
        JOptionPane.showMessageDialog(null, "How many rooms do you need painted my guy?");
        String amountOfRoomsAsString = JOptionPane.showInputDialog("Number of rooms");
        float amountOfRoomsAsFloat = Float.parseFloat(amountOfRoomsAsString);
        
        JOptionPane.showMessageDialog(null, "What is the price of paint per gallon mate?");
        String priceOfPaintPerGallonAsString = JOptionPane.showInputDialog("Price of paint per gallon");
        float priceOfPaintPerGallonAsFloat = Float.parseFloat(priceOfPaintPerGallonAsString);
        
        calculations(amountOfRoomsAsFloat,priceOfPaintPerGallonAsFloat);
        
    }
public static void calculations(float amountOfRoomsAsFloat, float priceOfPaintPerGallonAsFloat ) {
    
        
    float totalSquareFeet = 0;
    for(int i = 1; i <= amountOfRoomsAsFloat; i++) {
        JOptionPane.showMessageDialog(null, "How many square feet are there in each wall in room " + i + "?");
        String squareFeetPerRoomAsString = JOptionPane.showInputDialog("number of square feet");
        Float squareFeetPerRoomAsFloat =  Float.parseFloat(squareFeetPerRoomAsString);
        squareFeetPerRoomAsFloat = squareFeetPerRoomAsFloat *4;
        totalSquareFeet = totalSquareFeet + squareFeetPerRoomAsFloat;
        
    }
    
    float gallonsOfPaint = totalSquareFeet / 115;
    float costOfPaint = priceOfPaintPerGallonAsFloat * gallonsOfPaint;
    float hoursOfLabor = (totalSquareFeet / 115) * 8;
    float laborCharges = hoursOfLabor * 18.00F;
    float totalCost = costOfPaint + laborCharges;
    
    results(gallonsOfPaint,costOfPaint,hoursOfLabor,laborCharges,totalCost);
}

public static void results (float gallonsOfPaint,float costOfPaint,float hoursOfLabor,float laborCharges,float totalCost ){
    
    NumberFormat money = NumberFormat.getCurrencyInstance();
    System.out.println("The number Of gallons of paint required for this job: " + gallonsOfPaint );
        System.out.println("The amount of hours required to complete this job: " + hoursOfLabor);
        System.out.println("The total cost of paint: " + money.format(costOfPaint));
        System.out.println("The total cost of labor: " + money.format(laborCharges));
        System.out.println("The total cost of the job is: " + money.format(totalCost));
        
}

}
