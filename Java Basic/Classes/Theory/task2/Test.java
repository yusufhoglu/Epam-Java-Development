package task2;

 class Test {
    public static void main(String[] args) {
        double length = new Segment(new Point(0, 0), new Point(3, 4)).length();
        System.out.println(length);
    }
}
