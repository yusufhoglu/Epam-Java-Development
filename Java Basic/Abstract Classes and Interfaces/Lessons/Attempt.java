public abstract class Attempt {
    private static void method(){
        System.out.println("bu");
    }
}

class Subclass extends Attempt{

    public static void method() {
        System.out.println("deneme");
    }
}

class Main{
    public static void main(String[] args) {
        Attempt at = new Subclass();
    }
}