package A2;

import java.util.Optional;

public class C {
    {
        System.out.println("dynamic");
    }
    static {
        System.out.println("static");
    }
    public static void main(String[] args) {
        System.out.println("main");
        B b = new B();
        B b1 = new B();
        C c = new C();
        c.useC1();
        Optional name = Optional.empty();
        System.out.println(name.orElse("Blank"));
    }
    private class C1{
        public void souut(){
            System.out.println("C1");
        }
    }
    public void useC1(){
        C1 c1 = new C1();
        c1.souut();
    }
    static void doJob(String s1, String... str) {
        System.out.println("String, String...");
    }
}
