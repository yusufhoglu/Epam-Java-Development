 interface Interface1  {
    int someField = 100;
    String someMethod();
}
 interface Interface2 {
    double someField = 200.5;

    abstract String someMethod();
 }
 class SomeClass implements Interface1 {
    @Override
    public String someMethod() {
        System.out.println("In interface2 = " + Interface2.someField );
        return "It Works";
    }
}
  class Demo3 {
    public static void main(String[] args) {
        SomeClass obj = new SomeClass();
        System.out.println( obj.someMethod() );
        System.out.println( ( (Interface2)obj).someMethod() );
        System.out.println( ( (Interface1)obj).someField );
        System.out.println( Interface1.someField );

    }
}
