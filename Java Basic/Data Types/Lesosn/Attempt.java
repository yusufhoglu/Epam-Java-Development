import java.lang.reflect.Type;

public class Attempt {
    public static void main(String...args){
//        int num = 7000000000;//ERROR
//        long num = 7_000_000_000_L;//ERROR
//        long num = _7_000_000_000L;//ERROR
//        long num = 7_000_000_000L;
//        int a = 10;
////        long b =2;
////        System.out.println((a!=b)?("Not equal"):("Equal!"));
//        a++;
//        System.out.println(a); //11
//        System.out.println(a++); //11
//        System.out.println(a); //12
//        System.out.println(--a); //11
//        System.out.println(a); //11
////        System.out.println(num);
//        System.out.println("2 + 2 = " + (22+10));
//        byte b3 = 50;
//        int iVal = -100;
//        b3 += iVal--;
//        System.out.println(b3);
//        System.out.println(iVal);

//        float f = 1 / 2;
//        int f = 1 / 3;
//        float f = 1.45;
//        double f = 555d;
//        int i = 3;
//        byte b = 1;
//        byte b1 = 1 + 2;
//        String a = "deneme";
//        String b = "deneme";
//        String c = "dene"+"me";
//        String d = new String("deneme");
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
//        System.out.println(c.hashCode());
//        System.out.println(d.hashCode());

        int i = 3;
        byte b = 1;
        byte b1 = 1 + 2;                // line 1
        short s = 304111;               // line 2
        short s1 = (short) 304111;      // line 3
        b= b1 + 1;
        b = b + 2;
        b +=2;// line 4
        System.out.println(b);
        b = (byte)  (b1 + 1);           // line 5
        b = -b;                         // line 6
        b = (byte) -b;                  // line 7
        b1 *= 2;                        // line 8
        b = i;                          // line 9
        b = (byte)  i;
        b += i++;
        float f = 1.1f;
        b/= f;

//        System.out.println(b1);
//        String a = "deneme";
//        String b = "deneme";
//        String c = "dene"+"me";
//        String d = new String("deneme");
//        System.out.println(a.hashCode()); //-1335399024
//        System.out.println(b.hashCode()); //-1335399024
//        System.out.println(c.hashCode()); //-1335399024
//        System.out.println(d.hashCode()); //-1335399024
//        System.out.println(a ==b);
//        System.out.println(b == c);
//        System.out.println(d == c);
//        System.out.println(a==d);

    }
}
