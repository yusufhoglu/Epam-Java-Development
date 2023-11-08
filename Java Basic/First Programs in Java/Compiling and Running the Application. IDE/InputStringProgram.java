import java.util.InputMismatchException;
import java.util.Scanner;

public class InputStringProgram {
    public static void main(String...args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        System.out.println("hello "+ input);
        try{
            int number = scan.nextInt();
            System.out.println(number);
        }catch(InputMismatchException e){
            throw new InputMismatchException("You must enter a number!");
        }
    }
}
