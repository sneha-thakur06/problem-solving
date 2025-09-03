class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int n=arr.length;
        int ind=-1;
        
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                ind=i;
                break;
            }
        }
        
        
        if(ind==-1){
            reverse(arr,0,n-1);
            return;
        }
       
           else{
                for(int i=n-1;i>ind;i--){
            if(arr[i]>arr[ind]){
                int temp=arr[i];
                arr[i]=arr[ind];
                arr[ind]=temp;
                break;
                
            }
        }
           }
        
        reverse(arr,ind+1,n-1);
        
    }
    
   static void reverse(int[] arr, int start, int end){
        while(start<end){
            int swap=arr[start];
            arr[start]=arr[end];
            arr[end]=swap;
            start++;
            end--;
        }
    }
}