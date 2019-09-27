
import java.util.Random;




//You can use the following logic to determine whether a number is odd or even:

//If  ((number %2) == 0) {

    // the number is even

//} else {

   // the number is odd

//}
//Write a program with a method named isEven that accepts an int argument. 
//The method should return true if the argument is even, or false otherwise. 
//The program's main method should use a loop to generate 100 random integers. 
//It should use the isEven method to determine whether each random number is even or odd.
//When the loop is finished, the program should display the number of even numbers that were generated,
//and the number of odd numbers that were generated.
public class EvenOddCounter {
    public static void main(String[] args) {
         Random random = new Random();
         int even = 0;
         int odd = 0;
         
         
         for(int i =0; i <100; i++){
             int number = random.nextInt();
             if(isEven(number)) {
                 even = even + 1;
             }
             else{
                 odd = odd + 1;
             }
         }
         System.out.println(" The total amount of evens are : " + even);
         System.out.println(" The total amount of odds are : " + odd);
    }
    
    public static boolean isEven(int number) {
        
    if ((number % 2) == 0) {
            return true;
        }
    else{
        return false;
    }
    }
 
}

