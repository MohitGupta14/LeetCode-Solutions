class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i< nums.length;i++){
            if(map.containsKey(nums[i])){
               int temp =  map.get(nums[i]);
               map.put(nums[i],++temp);
            }else{
              map.put(nums[i],1);
            }
        }

        Queue<Integer> heap = new PriorityQueue<>(
            (n1, n2) -> map.get(n1) - map.get(n2));

        for (int n: map.keySet()) {
          heap.add(n);
          if (heap.size() > k) heap.poll();    
        }
       int[] top = new int[k];
       for(int i = k - 1; i >= 0; --i) {
            top[i] = heap.poll();
        }
        return top;
 
    }
}