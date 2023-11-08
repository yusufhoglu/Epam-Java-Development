import java.util.HashMap;
import java.util.List;
import java.util.SimpleTimeZone;

public class Wrapper {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt("-123"));
        System.out.println(Integer.parseInt("+123"));
        System.out.println(Integer.parseInt("123"));
//err        System.out.println(Integer.parseInt("123_45"));
//err        System.out.println(Integer.parseInt("12ABCD"));

        System.out.println(Integer.valueOf("1000",10)); //10lu sistemde 1000in temsili

        long map = 0b01000000_01000000_01000000_01000000_00001110_00000001_00000100_00000000L;
        String binaryMap = Long.toBinaryString(map);
        System.out.println(binaryMap);
        List<String> shots = List.of("A1", "B1", "C1", "D1");
        HashMap<String,String> stateMap = new HashMap<String,String>();
        int counter= 0;
        int letterCounter = 0;
        int numberCounter = 1;
        List<String> letter = List.of("A","B","C","D","E","F","G","H");
        for(int i= 0;i<binaryMap.length();i++){
            String currentValue = String.valueOf(binaryMap.charAt(i));
            switch (currentValue){
                case ("1"):
                    stateMap.put(letter.get(letterCounter) +numberCounter,"\u2610");
                    break;
                case ("0"):
                    stateMap.put(letter.get(letterCounter) +numberCounter,".");
                    break;
            }
            letterCounter++;
            if(counter++==7){
                counter=0;
                letterCounter = 0;
                numberCounter ++;
            }
        }
        for(String s:shots){
            System.out.println(s);
            if(stateMap.get(s) == "\u2610"){
                stateMap.put(s,"\u2612");
            }else {
                stateMap.put(s,"×");
            }
        }


        counter = 0;
        letterCounter = 0;
        numberCounter =1;
        for(int i=0;i < stateMap.size();i++){
            System.out.print(stateMap.get(letter.get(letterCounter)+numberCounter));
            letterCounter++;
            if(counter++==7){
                System.out.println();
                counter=0;
                letterCounter = 0;
                numberCounter++;
            }
        }
    }
}
