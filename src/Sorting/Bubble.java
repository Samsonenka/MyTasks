package Sorting;

import java.util.Arrays;

public class Bubble {

    public void sortArray(int[] arr){

        System.out.println(Arrays.toString(arr));

        boolean isSort = false;

        while (!isSort){
            isSort = true;
            for (int i = 1; i < arr.length; i++){
                if (arr[i] < arr[i - 1]){
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    isSort = false;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
