class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> bucket[]=new List[nums.length+1];
        for(int n:nums){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }else{
                map.put(n,1);
            }
        }

        for(int key:map.keySet()){
            int frequency=map.get(key);
            if(bucket[frequency]==null){
                bucket[frequency]=new ArrayList<>();
            }
            bucket[frequency].add(key);
        }


    int arr[]=new int[k];
    int count=0;
    for(int i=bucket.length-1;i>=0&& count<k;i--){
        if(bucket[i]!=null){
            for(Integer inner:bucket[i]){
                arr[count]=inner;
                count++;
            }
        }
    }

        return arr;
    }
}
