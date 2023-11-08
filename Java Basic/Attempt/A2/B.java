package A2;
class B {
    static {
        System.out.println("AA");
    }
    {
        System.out.println("BB");
    }
    public static void main(String[] args) {
        A1.A a = new A1.A();
        a.dos();
    }
}
