package Parent.child1.Binarysearch;

public class search1 {
    public static void main(String[] args) {
        int[] arr={-15,-10,-4,0,2,3,4,26,67};//ascending search
        int target=-2;
        int ans=binarysearch(arr, target);
        System.out.println(ans);
    }

    static int binarysearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            //int mid=(start +end)/2; might be possible that the value may exceed the range of integer
            int mid= start +(end-start)/2;
            if(target<arr[mid]){ //change < to > for descending search
                end=mid-1;
            }
            else if(target>arr[mid]){ //change > to < for descending search
                start=mid+1;
            }
            else {
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
