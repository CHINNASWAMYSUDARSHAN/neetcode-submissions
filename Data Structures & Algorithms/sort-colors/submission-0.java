class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int max=nums[0],min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }

        int index=0;
        for(int i=min;i<=max;i++){
            while(map.getOrDefault(i,0)>0){
                nums[index]=i;
                index++;
                map.put(i,map.get(i)-1);
            }
        }
        
        
    }
}