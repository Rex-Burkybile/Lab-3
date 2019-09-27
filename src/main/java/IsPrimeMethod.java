
import java.util.Scanner;
import javax.swing.JOptionPane;

//A prime number is a number that is evenly divisible only by itself and 1.
//For example, the number 5 is prime because it can be divided evenly by 1 and 5 only

//Write a method named isPrime which takes an integer as an argument and
//returns true if the argument is a prime number, or false otherwise.
//Demonstrate this method's use in a complete program.
public class IsPrimeMethod {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
    JOptionPane.showMessageDialog(null, "Enter a number and I'll tell you if it's prime?");
    String numberAsString = JOptionPane.showInputDialog("Your number ;)");
    int number = Integer.parseInt(numberAsString);
    if (isPrime(number)) {
        System.out.println("Congrates the number " + number + " is Prime!");
    }
    else{
        System.out.println("Darn the number " + number + " isn't Prime!");
    }
        
    }
    
   public static boolean isPrime(int number) {
       if (number <= 0) {
           return false;
       }
       else if (number >=1){
           for(int i = 2; i < number; i++) {
               if (number % i == 0){
                   return false;
               }
            }
        }
       return true;
       }
   }
