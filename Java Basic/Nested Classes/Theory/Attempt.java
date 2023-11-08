class Attempt {
    public void pop() {
        System.out.println("popcorn");
    }
}
class Food {
    Attempt p = new Attempt() {
        public void sizzle() {
            System.out.println("anonymous sizzling popcorn");
        }
        public void pop() {
            System.out.println("anonymous popcorn");
        }
    };
    public static void main(String[] args) {
        Food food = new Food();
        food.p.pop();
        food.p.sizzle();
    }
}
