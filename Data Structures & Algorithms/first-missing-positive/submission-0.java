class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet();
        int max=0;
        for(int num:nums){
            set.add(num);
            if(num>max){
                max=num;
            }
        }

        int i=1;
        while(i<=max){
            if(!set.contains(i)){
                return i;
            }
            i++;
        }
    return max+1;
    }
}