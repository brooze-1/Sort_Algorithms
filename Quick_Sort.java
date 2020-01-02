import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args){
        int[] arr=new int[]{3,4,6,7,2,7,2,8,0,9,1};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quicksort(int[] arr,int start,int end){
        if(start<end){
            int pivot=arr[start];
            int low=start;
            int high=end;
            while(low<high){
                while(low<high&&pivot<=arr[high]){
                    high--;
                }
                arr[low]=arr[high];
                while(low<high&&arr[low]<=pivot){
                    low++;
                }
                arr[high]=arr[low];
            }
            arr[low]=pivot;
            quicksort(arr,start,low);
            quicksort(arr,low+1,end);
        }
    }
}
