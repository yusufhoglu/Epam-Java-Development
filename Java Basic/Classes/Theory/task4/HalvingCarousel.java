import java.util.Arrays;

public class HalvingCarousel extends DecrementingCarousel{

    int[] arr = DecrementingCarousel.container;
    int counter = 0;

    HalvingCarousel(int lengthOfArr) {
        super(lengthOfArr);
    }

    boolean addElement(int element) {
        System.out.println(arr);
        return super.addElement(element);
    }
    @Override
    CarouselRun run(){
        if (flag){
            flag = false;
            return new CarouselRun(true);
        }return null;
    }
    int halve(){
        System.out.println(Arrays.toString(arr));

        if(isFinished()){
            return -1;
        }
        checkCounter();
        if (arr[counter] != 0){
            int subValue = arr[counter];
            arr[counter++] /=2;
            return subValue;
        }
        ++counter;
        return halve();
    }

    int checkCounter(){
        if ( counter == arr.length){
            counter = 0;
        }
        return counter;
    }
    boolean isFinished(){
        for(int element:arr)
            if(element != 0)
                return false;
        return true;
    }
}
