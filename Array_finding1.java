package Parent.child1;

public class Array_finding1 {
    public static void main(String[] args) {
        int[] arr={23,12,45,33,77,99,66,48};
       int tar= linearsearch(arr,48);
        System.out.println(tar);
    }
    static int linearsearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int index = 0; index <arr.length ; index++) {
            int element=arr[index];
            if(element==target){

                return index;
            }
        }
        return -1;
    }
}
