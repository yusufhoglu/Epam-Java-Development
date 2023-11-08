import java.util.Arrays;

public class Attempt {
//    int a;
//    boolean b;
//    static int ab;
//    static int ac;
//    static int c = init();
//    public static int init(){
//        System.out.println("falan filan");
//        return 0;
//    }
//    static final StringBuilder FİNAL_ATTEMPT = new StringBuilder();
//    Attempt(){
//        FİNAL_ATTEMPT.append("hello");
//        FİNAL_ATTEMPT.append("world");
//    }

//    private static char[] alph;
//    //!!!!
//    static {
//        alph =new char[26];
//        int i = 0;
//        for (char c = 'a'; i < alph.length; c++, i++) {
//            alph[i] = c;
//        }
//        System.out.println(Arrays.toString(alph));
//    }
//    private static int numOfCars;
//
//    public Attempt() {
//        //...
//        numOfCars++;
//    }
//    public Attempt(String model) {
//        //...
//        numOfCars++;
//    }
    private final int XX = 50;
    static int ZZ;
    byte b;
    private final int YY;
    {
        YY=10;
        ZZ=100;
        System.out.println("İyi");
    }
    Attempt(){
        ZZ=20;
    }
    Attempt(String s){
        ZZ=30;
    }
    static {
        System.out.println("naber");
    }
    public static void main(String...args){
        var at = new Attempt();
        System.out.println(at.ZZ);
        var ab = new Attempt("deneme");
        System.out.println(ab.ZZ);
//        var deneme =  new Attempt();
//        FİNAL_ATTEMPT.append("hephello");
//        System.out.println(FİNAL_ATTEMPT);
//        long a = 10l;
//        short b = 2;
//        System.out.println();
//        System.out.println(sumOf());
//        int s = sumOf(new int[]{2, 3, 4});
    }
//    public static byte sumOf(int ... args){
//        int sumOf = 0;
//        for (int element:args)
//            sumOf+=element;
//        return 1;
//    }
}
