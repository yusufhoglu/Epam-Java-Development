public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel{
    public DecrementingCarouselWithLimitedRun(int capacity,int finishCounter) {
        super(capacity);
        arr = DecrementingCarousel.container;
        this.finishCounter = finishCounter;
    }
    int finishCounter;
    static int entryCounter = 0;

    int[] arr;
    int counter = 0;
    int decrementCounter = 1;

    @Override
    public CarouselRun run(){
        if (flag){
            flag = false;
            return new CarouselRun(true,finishCounter);
        }return null;
    }
    public int decrementDecrase(){
        if(isFinished())
            return -1;
        checkCounter();
        if (arr[counter] != 0){
            entryCounter++;
            return arr[counter++]--;
        }
        ++counter;
        return decrementDecrase();
    }

    int checkCounter(){
        if ( counter == arr.length){
            decrementCounter++;
            counter = 0;
        }
        return counter;
    }


    boolean isFinished(){
        if(entryCounter == finishCounter)
            return true;
        for(int element:arr)
            if(element > 0)
                return false;
        return true;
    }
}
