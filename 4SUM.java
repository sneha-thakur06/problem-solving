  4SUM
========

BRUTFORCE APPROACH     ---------------- 
====================

TIME COMPLEXITY = O(N)^4
SPACE COMPLEXITY = O(1)


import java.util.*;
public class FourSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter value for the target: ");
        int target=sc.nextInt();

        List<List<Integer>> li= new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        if(arr[i]+arr[j]+arr[k]+arr[l]==target){
                            li.add(new ArrayList<>(List.of(arr[i],arr[j],arr[k],arr[l])));
                        }
                    }
                }
            }
        }
        System.out.println(li);
    }
}




BETTER SOLUTION
----------------

TIME COMPLEXITY = O(N)^3
SPACE COMPLEXITY = O(N)


import java.util.*;
public class FourSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter value for the target: ");
        int target=sc.nextInt();

        List<List<Integer>> li= new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Set<Integer> set=new HashSet<>();
                for(int k=j+1;k<n;k++){
                    long sum=arr[i];
                    sum+=arr[j];
                    sum+=arr[k];

                    long l= target-sum;
                    if(set.contains((int)l)){
                        List<Integer> temp=new ArrayList<>(List.of((int) arr[i], (int) arr[j], (int) arr[k],(int) l));
                        if(!li.contains(temp)){
                            li.add(temp);
                        }
                    }
                    set.add(arr[k]);
                }
            }
        }

            System.out.println(li);
  }
}





   OPTIMAL SOLUTION
======================

TIME COMPLEXITY = O(N)^3
SPACE COMPLEXITY = O(1)


import java.util.*;
public class FourSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter value for the target: ");
        int target=sc.nextInt();

         List<List<Integer>> li= new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length;j++){
                if(j> i+1 && nums[j] == nums[j-1]){
                    continue;
                }

                int k=j+1;
                int l=nums.length-1;

                while(k<l){
                 
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                    if (sum == (long) target) {
                        li.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1]){
                            k++;
                        }

                        while(k<l && nums[l]==nums[l+1]){
                            l--;
                        }
                       
                    }

                    else if(nums[i]+nums[j]+nums[k]+nums[l]<target){
                        k++;
                    }

                    else{
                        l--;
                    }
                }
            }
        }
        
        System.out.println(li);
    }
}


