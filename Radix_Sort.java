import java.util.Arrays;

public class Radix_Sort {
    public static void main(String[] args){
        int[] arr=new int[]{23,6,189,45,9,287,56,1,798,34,65,652,5};
        radixsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void radixsort(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int maxlength=(max+"").length();
        int[][] temp=new int[10][arr.length];
        int[] counts=new int[10];
        for(int i=0,n=1;i<maxlength;i++,n*=10){
            for(int j=0;j<arr.length;j++){
                int ys=arr[j]/n%10;
                temp[ys][counts[ys]]=arr[j];
                counts[ys]++;
            }
            int index=0;
            for (int k=0;k<counts.length;k++){
                if(counts[k]!=0){
                    for(int l=0;l<counts[k];l++){
                        arr[index]=temp[k][l];
                        index++;
                    }
                    counts[k]=0;
                }
            }
        }
    }
}
