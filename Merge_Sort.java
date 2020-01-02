import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args){
        int[] arr=new int[]{1,3,5,2,4,6,8,10};
        System.out.println(Arrays.toString(arr));
        mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergesort(int[] arr,int low,int high){
        int mid=(high+low)/2;
        if(low<high){
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public static void merge(int[] arr,int low,int mid,int high){
        int[] temp=new int[high-low+1];
        int i=low;
        int j=mid+1;
        int index=0;
        while(i<=mid&&j<=high){
            if(arr[i]<=arr[j]){
                temp[index]=arr[i];
                i++;
            }else{
                temp[index]=arr[j];
                j++;
            }
            index++;
        }
        while(j<=high){
            temp[index]=arr[j];
            j++;
            index++;
        }
        while(i<=mid){
            temp[index]=arr[i];
            i++;
            index++;
        }
        for(int k=0;k<temp.length;k++){
            arr[k+low]=temp[k];
        }
    }
}
