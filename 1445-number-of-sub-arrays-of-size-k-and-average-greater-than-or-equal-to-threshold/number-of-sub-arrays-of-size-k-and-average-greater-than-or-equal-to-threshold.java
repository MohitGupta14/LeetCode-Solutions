class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        int sum = 0;
        for(int i = 0 ; i <arr.length ; i++){
            list.add(arr[i]);
            sum = sum + arr[i];

         
            if(list.size() > k){
                sum = sum-list.get(0);
                list.remove(0);

            }

            if(list.size() == k && sum/k >= threshold){
                count++;
            }

    
        }

        return count;
    }
}