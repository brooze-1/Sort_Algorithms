import java.util.Arrays;

public class Insert_Sort {
    public static void main(String[] args){
        int[] arr=new int[]{5,3,2,8,5,9,1,0};
        insertsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertsort(int[] arr){
        for(int i=1;i<arr.length;i++){

            if(arr[i]<arr[i-1]){
                int temp=arr[i];
                int j;
                for(j=i-1;j>=0&&temp<arr[j];j--){
                    arr[j+1]=arr[j];
                }
                arr[j+1]=temp;
            }
        }
    }
}
