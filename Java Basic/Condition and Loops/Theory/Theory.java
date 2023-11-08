import javax.script.ScriptContext;
import java.util.Scanner;

public class Theory {
    public static void main(String...args) {
//        var scanner = new Scanner(System.in);
//        int numberOfStranger = Integer.parseInt(scanner.nextLine());
//
//        if(numberOfStranger<0)
//            System.out.println("Seriously? Why so negative?");
//        else if(numberOfStranger == 0)
//            System.out.println("Oh, it looks like there is no one here");
//        else
//            for(int i = 0;i < numberOfStranger;i++){
//                String nameOfStranger = scanner.nextLine();
//                System.out.println("Hello, "+nameOfStranger);
//            }
//        var scanner = new Scanner(System.in);
//        int up = scanner.nextInt();
//        int down = scanner.nextInt();
//        int h = scanner.nextInt();
//
//        int currentDay = 1;
//        int currentLocation = up;
//
//        if (down >= up && up < h )
//            System.out.println("Impossible");
//        else {
//            while (currentLocation < h) {
//                currentLocation -= down;
//                currentLocation += up;
//                currentDay++;
//            }
//            System.out.println(currentDay);
//          }
//        var scan = new Scanner(System.in);
//        int input;
//        int maxNum = 0;
//
//        do {
//            input = scan.nextInt();
//            maxNum = (maxNum <= input) ? input : maxNum;
//        }while(input != 0);
//        System.out.println(maxNum);
//        var scan = new Scanner(System.in);
//        int input;
//        int totalNum = 0;
//        int counter = 0;
//        do {
//            input = scan.nextInt();
//            if ( input != 0){
//                totalNum += input;
//                counter += 1;
//            }
//        }while(input != 0);
//        System.out.println(totalNum/counter);
//        var scanner = new Scanner(System.in);
//        int numberOfPeople = scanner.nextInt();
//        int numberOfPiece = scanner.nextInt();
//        int var=1;
//
//        while (var*numberOfPiece%numberOfPeople != 0){
//            var+=1;
//        }
//
//        System.out.println(var);
        var scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double discriminant = (b*b)-(4*a*c);
        double root1;
        double root2;
        if ((discriminant == 0)) {
            root1 = (-b + Math.sqrt(discriminant)) / (2*a);
            System.out.println(root1);
        }
        else if(discriminant > 0){
            root1 = (-b+Math.sqrt(discriminant))/(2*a);
            root2 = (-b-Math.sqrt(discriminant))/(2*a);

            System.out.println(root1);
            System.out.println(root2);
        }else {
            System.out.println("no roots");
        }
    }
}
