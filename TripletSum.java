class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        Arrays.sort(arr);
       for(int i=0;i<arr.length-1;i++){
           int s=i+1;
           int e=arr.length-1;
           int sum=0;
           while(s<e){
               sum=arr[i]+arr[e]+arr[s];
               if(sum==target){
                   return true;
               }
               else if(sum<target){
                   s++;
               }
               else{
                   e--;
               }
           }
       }
       return false;
    }
}
