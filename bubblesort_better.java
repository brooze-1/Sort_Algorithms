import java.util.Arrays;

public class bubblesort_better {
    public static void main(String[] args){
        int[] arr=new int[]{5,7,2,9,4,1,0,5,8,7};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        int n=arr.length;
        if(n<=1) return;
        for(int i=0;i<n;++i){
            boolean flag=false;
            for(int j=0;j<n-1-i;++j){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag) break;
        }
    }
}
