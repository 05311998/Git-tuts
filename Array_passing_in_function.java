package Parent.child1;

import java.util.Arrays;

public class Array_passing_in_function {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(arr));
        funct1(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void funct1(int[] arr) {
        arr[1]=3;
    }
}
