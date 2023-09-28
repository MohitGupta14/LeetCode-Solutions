class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        Queue<Integer> list = new LinkedList<>();
        int count = 0;
        int sum = 0;
        for(int i = 0 ; i <arr.length ; i++){
            list.add(arr[i]);
            sum = sum + arr[i];

         
            if(list.size() > k){
                sum = sum-list.peek();
                list.remove();

            }

            if(list.size() == k && sum/k >= threshold){
                count++;
            }

    
        }

        while(!list.isEmpty()){
            list.remove();
        }
        return count;
    }
}