package first;

import java.util.Arrays;

public class RecurHomework {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(arr);
        int count=0;
        int tempNumber=arr[0];
        for(int i=0;i< arr.length;i++){
           if(i==0 || tempNumber!=arr[i]){
               for(int k:arr){
                   if(k==arr[i]){
                       count++;
                       tempNumber=arr[i];
                   }
               }
               System.out.println(arr[i]+" number "+count+" times written.");
           count=0;
           }
        }
    }
}
