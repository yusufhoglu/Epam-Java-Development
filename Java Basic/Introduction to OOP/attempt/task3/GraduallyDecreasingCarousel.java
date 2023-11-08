//public class GraduallyDecreasingCarousel extends DecrementingCarousel {
//    public GraduallyDecreasingCarousel(int lengthOfArr) {
//        super(lengthOfArr);
//        arr = DecrementingCarousel.container;
//    }
//    int[] arr;
//    int counter = 0;
//    int decrementCounter = 1;
//
//
//    @Override
//    public CarouselRun run(){
//        if (flag){
//            flag = false;
//            return new CarouselRun(true);
//        }return null;
//    }
//    public int increasingDecrement(){
//        if(isFinished())
//            return -1;
//        checkCounter();
//        if (0 < arr[counter]){
//            int subValue = arr[counter];
//            arr[counter++] -= decrementCounter;
//            return subValue;
//        }
//        ++counter;
//        return increasingDecrement();
//    }
//
//    int checkCounter(){
//        if ( counter == arr.length){
//            decrementCounter++;
//            counter = 0;
//        }
//        return counter;
//    }
//
//
//    boolean isFinished(){
//        for(int element:arr)
//            if(element > 0)
//                return false;
//        return true;
//    }
//}
