import java.util.Arrays;

public class DecrementingCarousel {
    DecrementingCarousel(int lengthOfArr){
        container = new int[lengthOfArr];
    }
    public static int[] container;
    boolean flag = true;
    boolean addElement(int element){
        if(checkNextElement(container)!=(-1) && checkNumber(element) && flag){
            container[checkNextElement(container)] = element;
            return true;
        }else
            return false;
    }

    CarouselRun run(){
        if (flag){
            flag = false;
            return new CarouselRun();
        }return null;
    }

    static int checkNextElement(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                return i;
            }
        }
        return -1;
    }

    boolean checkNumber(int number){
        if(number <= 0)
            return false;
        return true;
    }
}
