package Parent.child1.Binarysearch;

public class Order_agnostic {
    //if order is not known i.e, not known about ascending or descending
    public static void main(String[] args) {
       // int[] arr={1,3,5,7,17,24};
        int[] arr={89,76,43,12,0,-1};
        int target=76;
        int ans=orderAgnostic(arr,target);
        System.out.println(ans);
    }

    static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            //int mid=(start +end)/2; might be possible that the value may exceed the range of integer
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) { //change < to > for descending search
                    end = mid - 1;
                } else if (target > arr[mid]) { //change > to < for descending search
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) { //change < to > for descending search
                    end = mid - 1;
                } else if (target < arr[mid]) { //change > to < for descending search
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
