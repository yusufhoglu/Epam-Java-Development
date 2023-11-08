import java.util.Arrays;

public class CarouselRun {

    static int[] arr = DecrementingCarousel.container;
    int counter = 0;
    CarouselRun(){};
    CarouselRun(boolean flag){
        this.flag = flag;
        gd = new GraduallyDecreasingCarousel(arr.length);
        gd.arr = arr;
    }
    static boolean flag;
    GraduallyDecreasingCarousel gd;

    public int next(){
        if (flag)
            return gd.increasingDecrement();
        return decrase();
    }
    int decrase(){
        if(isFinished())
            return -1;
        checkCounter();
        if (arr[counter] != 0)
            return arr[counter++]--;
        ++counter;
        return decrase();
    }
     int checkCounter(){
        if ( counter == arr.length){
            counter = 0;
        }
        return counter;
    }
    boolean isFinished(){
        for(int element:arr)
            if(element>0)
                return false;
        return true;
    }
}
