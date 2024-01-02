package Parent.child1;

import java.util.Arrays;

public class Array_swap {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};
     //   swap1(arr,1,3);
        reverse1(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap1(int[] arr, int index1, int index2) {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    static void reverse1(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap1(arr, start, end);
            start++;
            end--;
        }
    }
}
