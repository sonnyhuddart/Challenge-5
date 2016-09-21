package challenge.pkg5;
import java.util.Scanner;
public class Challenge5 {

    
    public static void main(String[] args) {
             Scanner myScanner = new Scanner(System.in);
     
        System.out.println("Please enter a number?");
        
        int num = myScanner.nextInt();
        
          if (num > 20) {
            System.out.println("You achieved an A");
          }
          if (num < 10) {
            System.out.println("You failed the test");  
          }
          if (num >= 10 && num <= 19) {
            System.out.println("You achieved a C");
            
          }     
    
    }
}
    
          