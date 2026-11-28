class Solution {
    public int firstMissingPositive(int[] nums) {
    //     HashSet<Integer> set=new HashSet();
    //     int max=0;
    //     for(int num:nums){
    //         set.add(num);
    //         if(num>max){
    //             max=num;
    //         }
    //     }

    //     int i=1;
    //     while(i<=max){
    //         if(!set.contains(i)){
    //             return i;
    //         }
    //         i++;
    //     }
    // return max+1;



    int n=nums.length;
    int i=0;
    while(i<n){
        int correctIndex=nums[i]-1;
        if(nums[i]>0 && nums[i]<n && nums[i]!=nums[correctIndex]){
            int temp=nums[i];
            nums[i]=nums[correctIndex];
            nums[correctIndex]=temp;
        }
        else{
            i++;
        }
    }

    for(i=0;i<n;i++){
        if(nums[i]!=i+1){
            return i+1;
        }
    }
    return n+1;



    }
}