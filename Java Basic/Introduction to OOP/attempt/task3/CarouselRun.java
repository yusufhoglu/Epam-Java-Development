import java.util.Arrays;

public class CarouselRun {

    int[] arr = DecrementingCarousel.container;
    int counter = 0;
    CarouselRun(){};
    CarouselRun(boolean flag,int finishCounter){
        this.flag = flag;
        hc = new DecrementingCarouselWithLimitedRun(arr.length,finishCounter);
        hc.arr = arr;
    }
    static boolean flag;
    DecrementingCarouselWithLimitedRun hc;
    public int next() {
        try{
            if (flag){
                return hc.decrementDecrase();
            }else {
                return decrase();
            }
        }catch (Exception e){
            throw new UnsupportedOperationException();
        }
    }

    public boolean isFinished() {
        try{
            if (flag){
                return hc.isFinished();
            }else {
                for(int element:arr)
                if(element>0)
                    return false;
                return true;
            }
        }catch (Exception e){
            throw new UnsupportedOperationException();
        }
    }

    int checkCounter(){
        if ( counter == arr.length){
            counter = 0;
        }
        return counter;
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
}
