public class Attempt
{
    public static void main(String[] args) {
//        short number = -100;
//        {
//            int valueInt = 2;
//            System.out.println(number + "; " + valueInt);
//        }
//        System.out.println(number + "; ");
//        int countDays = 75; // number of days before the flight
//        long percent;
//        if (countDays >= 90) {
//            percent = 50;
//        } else if (countDays >= 60) {
//            percent = 30;
//        } else if (countDays >= 30) {
//            percent = 10;
//        } else {
//            percent = 0;
//        }
//        System.out.println(percent);
//        final byte RANGE = 49;
//        switch(49) {
//            case 22:
//                System.out.println(2);
//                break;
//            case RANGE:
//                System.out.println("1");
//
//            case 52:
//                System.out.println(3);
//            default:
//                /* statements  */
//        }
//
//        int value = switch(44){
//            case 22 -> 2;
//            case RANGE,52 -> 3;
//            default -> {
//                System.out.println("no way ");
//                yield 50;
//            }
//        };
//        System.out.println(value);
            int i = 0;
            outer: while (i++ < 3) {
                int j = 0;
                while (j++ < 5) {
                    if (j == 2) {
                        continue outer;
                    }
                    System.out.println("i = " + i + "; j = " + j);
                }
            }
        }


}
