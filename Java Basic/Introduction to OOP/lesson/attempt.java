//import firstPackage.firstinfirst;
//import firstPackage.first;
//public class attempt{
//    static void aA(double c,double ...a){
//        System.out.println(a);
//    }
//    static void aA(double... a){
//        System.out.println(a);
//    }
//    public static void main(String[] args) {
//        first first = new first();
//        first ff = new firstinfirst();
//        first.a();
//        ff.a();
//        System.out.println(ff.b);
//        float c = 3;
//        aA(3);
//
//
//    }
//}
public class attempt {
     void doJob(Integer num) {
        System.out.println("Integer");
    }
     void doJob(Object obj) {
        System.out.println("Object");
    }
     void doJob(int number) {
        System.out.println("int");
    }
    public static void main(String[] args) {
        Object object = 10;
        attempt a = new attempt();//Line1
        a.doJob(object);
    }
}
