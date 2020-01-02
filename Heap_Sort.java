import java.util.Arrays;

public class Heap_Sort {
    public static void main(String[] args){
        int[] arr=new int[]{23,6,189,45,9,287,56,1,798,34,65,652,5};
        heapsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void heapsort(int[] arr){
        int start=(arr.length-1)/2;
        for(int i=start;i>=0;i--){
            maxheap(arr,arr.length,i);
        }
        for(int i=arr.length-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            maxheap(arr,i,0);
        }
    }
    public static void maxheap(int[] arr,int size,int index){
        int left=2*index+1;
        int right=2*index+2;
        int max=index;
        if(left<size&&arr[left]>arr[max]){
            max=left;
        }
        if(right<size&&arr[right]>arr[max]){
            max=right;
        }
        if(max!=index){
            int temp=arr[index];
            arr[index]=arr[max];
            arr[max]=temp;
            maxheap(arr,size,max);
        }
    }
}
