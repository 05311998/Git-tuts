package Parent.child1;

public class Array_max {
    public static void main(String[] args) {
        int[] x={2,3,10,4,5};
//        System.out.println(max1(x));
        System.out.println(maxRange(x, 1, 3));

    }

//     static int max1(int[] x) {
//       int maxVal=x[0];
//         for (int i = 1; i < x.length; i++) {
//             if(x[i]>maxVal){
//                 maxVal=x[i];
//             }
//         }
//         return maxVal;
//    }
    //Range
static int maxRange(int[] x, int start, int end) {
    int maxVal=x[start];
    for (int i = start; i <=end; i++) {
        if(x[i]>maxVal){
            maxVal=x[i];
        }
    }
    return maxVal;
}
}
