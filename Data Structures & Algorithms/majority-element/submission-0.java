class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        int n=nums.length;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>n/2){
                return e.getKey();
            }
        }

        return -1;
        
    }
}