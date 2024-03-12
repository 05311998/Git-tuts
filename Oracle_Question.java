package Parent.child1;

import java.util.Arrays;

public class Oracle_Question {
    public static void main(String[] args) {
        int[] arr={1,3,2,3,4,3,6,3,8,3,9,3,11,12,13,15,3,21,3,43};
        int val=3;
        arrfun(arr,val);
    }
    public static void arrfun(int[] arr,int val)
    {
        int last=arr.length-1;
        for (int i = 0; i <last ; i++) {
            if(arr[i]==val)
            {
                if(arr[i]==arr[last])
                {
                    last--;
                }
                int temp=arr[last];
                arr[last]=arr[i];
                arr[i]=temp;
                last--;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
