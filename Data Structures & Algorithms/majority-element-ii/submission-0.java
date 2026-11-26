class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>(nums.length/3)){
                list.add(e.getKey());
            }
        }
        return list;
    }
}