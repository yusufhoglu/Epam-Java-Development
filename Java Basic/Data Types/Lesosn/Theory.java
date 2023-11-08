import java.util.Scanner;

public class Theory {
    public static void main (String...args){
        var scanner = new Scanner(System.in);
        long value = scanner.nextLong();

        long hour = value/60/60;
        long formattedHour = (hour >= 24) ? (hour -= 24) : (formattedHour = hour);
        long minute = (value /60)%60;
        String formattedMinute = String.format("%02d",minute);
        long second = value%60;
        String formattedSecond = String.format("%02d",second);
        System.out.println(formattedHour+":"+formattedMinute+":"+formattedSecond);
    }
}
