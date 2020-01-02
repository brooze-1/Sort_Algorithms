import java.util.Arrays;

public class Shell_Sort {
    public static void main(String[] args){
        int[] arr=new int[]{3,4,5,7,1,2,0,3,6,8};
        shellsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void shellsort(int[] arr){
        int k=1;
        for(int d=arr.length/2;d>0;d/=2){
            for(int i=d;i<arr.length;i++){
                for(int j=i-d;j>=0;j-=d){
                    if(arr[j]>arr[j+d]){
                        int temp=arr[j];
                        arr[j]=arr[j+d];
                        arr[j+d]=temp;
                    }
                }
            }
            System.out.println("第"+k+"次排序结果："+Arrays.toString(arr));
            k++;
        }
    }
}
