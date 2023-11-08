
public class attempt {
    public static void main(String[] args) {
        HalvingCarousel carousel = new HalvingCarousel(7);

        carousel.addElement(7);
        carousel.addElement(3);
        carousel.addElement(4);
        carousel.addElement(7);

        CarouselRun run = carousel.run();

        System.out.println( run.next());
        System.out.println( run.next());
        System.out.println( run.next());
        System.out.println( run.next());
        System.out.println( run.next());
        System.out.println( run.next());
        System.out.println( run.next());
        System.out.println( run.next());
        System.out.println( run.next());
        System.out.println( run.next());


//        assertEquals(3, run.next());
//        assertEquals(4, run.next());
//
//        assertEquals(3, run.next());
//        assertEquals(1, run.next());
//        assertEquals(2, run.next());
//
//        assertEquals(1, run.next());
//        assertEquals(1, run.next());
//
//        assertEquals(-1, run.next());
//        assertTrue(run.isFinished());
    }
}