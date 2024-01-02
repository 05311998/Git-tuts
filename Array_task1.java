package Parent.child1;

import java.util.Arrays;

public class Array_task1 {
    public static void main(String[] args) {
        int[] arr={3,2,5,6,4};
        int y[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
             y[i] =  arr[i] * 2;

        }
        System.out.println(Arrays.toString(y));
    }
}
