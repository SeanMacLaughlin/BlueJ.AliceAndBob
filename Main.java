/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    
    if(input.equals("Bob")) {
        System.out.println("Hi Bob!");
    } else if(input.equals("Alice")) {
        System.out.println("Hi Alice!");
    } else {
        System.out.println("Who goes there?");
    }
        
    
    }
}
