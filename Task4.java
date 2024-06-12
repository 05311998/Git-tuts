package Parent.child1;

public class Task4 {

    public static void main(String[] args) {
        //34,56,78,23,56,25,56,09.56
        int[] arr1={34,56,78,23,56,25,56,9,56,30};
        arr(arr1);
    }

    static void arr(int arr1[])
    {
        int start= 0;
        int last= arr1.length-1;
        int mid=(arr1.length)/2;
       while(start!=mid)
       {
           int temp= arr1[start]+arr1[last];
           start++;
           last--;
           System.out.println(temp);
        }
    }
}
