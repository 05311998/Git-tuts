package Parent.child1;

public class Array_Min {
    public static void main(String[] args) {
        int[] arr={12,43,-7,0,4,89};
        //ArrMin(arr);
        System.out.println(ArrMin(arr));
    }
    static int ArrMin(int[] arr){
        int x=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<x){
                x=arr[i];
            }
        }
        return x;
    }
}
