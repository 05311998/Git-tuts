package Parent.child1;
import java.util.Scanner;
public class Array_task {
    public static void main(String[] args) {
        int[] arr=new int[3];
//        Scanner in= new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=in.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]+=arr[i];
//            if(i==arr.length-1)
//            {
//                System.out.println(arr[i]+=18);
//            }
        float z= ArrItems(arr);
        System.out.println(z);
        }
    static float ArrItems(int[] x)
    {
        int y=0;
        int z= 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i <x.length ; i++) {
            x[i]=in.nextInt();
        }
        for (int i = 0; i < x.length; i++) {

          z=x[i]+z;
            if(i==(x.length-1))
            {
                y= z+18;
            }
        }
        return y;
    }
}
