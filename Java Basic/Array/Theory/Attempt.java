import java.util.Arrays;

public class Attempt {
    public static void main(String ...args){
        int[] array = new int[]{18, 1, 3, 6, 7, -5};
        System.out.println(Arrays.toString(localMAX(array)));

//        int treulsst = maxMethod(nums);
//        System.out.println(treulsst);
//        localMAX(nums);
//        System.out.println();
    }
//    public static int maxMethod (int[] arr){
//        int maxValue = arr[0];
//        for (int element:arr)
//            if(element > maxValue)
//                maxValue = element;
//        return maxValue;
//    }
//    public static int sumOf(int [] arr){
//        int sumOf = 0;
//        for (int element:arr)
//            if(element%2==0)
//                sumOf += element;
//        return sumOf;
//    }
//    public static String sumOfPrevious(int[] array){
//        boolean[] sumOf = new boolean[array.length];
//        sumOf[0]=false;
//        sumOf[1]=false;
//        for(int i=0,j=1;j<array.length-1;i++,j++){
//           if(array[i]+array[j]==array[j+1])
//               sumOf[j+1] = true;
//           else
//               sumOf[j+1] = false;
//        }
//
//        return Arrays.toString(sumOf);
//    }

    public static int[] localMAX(int[]arr){
        int[] subArr = new int[arr.length];
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if (i == 0 && arr[i] <= arr[i + 1]) {
                subArr[j] = arr[i];
                j++;
            } else if ( i == arr.length - 1){
                if(arr[i] <= arr[i - 1]){
                    subArr[j] = arr[i];
                    j++;
                }
            }else if (i != 0){
                if(arr[i+1] >= arr[i] || arr[i] <= arr[i-1]) {
                    subArr[j] = arr[i];
                    j++;
                }
            }
        }
        return Arrays.copyOf(subArr,j);
    }
//    public static int[] cycleSwap(int[]arr){
//        if(arr.length>1){
//            int[] subArr = new int[arr.length];
//            subArr[0] = arr[arr.length-1];
//            System.arraycopy(arr,0,subArr,1,arr.length-1);
//            return subArr;
//        }else
//            return arr;
//
//    }
//    public static int[] cycleSwap(int[]arr,int shift){
//        if(arr.length>1){
//            int[] subArr = new int[arr.length];
//            System.arraycopy(arr,arr.length-shift,subArr,0,shift);
//            System.arraycopy(arr,0,subArr,shift,arr.length-shift);
//            return subArr;
//        }else
//            return arr;
//    }
}
