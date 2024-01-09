package Parent.child1.Binarysearch;

import java.util.*;


public class twod_Array {
    public static void main(String[] args) {
        int[][] mat={
                {10,20,30,40},
                {15,25,35,45},
                {18,28,38,48},
                {22,34,37,59}
        };
        System.out.println(Arrays.toString(twod(mat,45)));
    }


    static int[] twod(int[][] matrix,int target)
    {
        int r=0;
        int c=matrix.length-1;
        while(r<matrix.length && c>=0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            } else if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
