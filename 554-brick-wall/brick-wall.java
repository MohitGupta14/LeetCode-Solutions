class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        
       int n = wall.size();
       int temp = 0;
       for(int i = 0 ; i < wall.get(0).size();i++){
            temp = temp + wall.get(0).get(i);
       }
       List<Integer>myList = new ArrayList<>();
       for (int i = 0; i < wall.size(); i++) {
            if(wall.get(i).get(0) != temp){
              myList.add(wall.get(i).get(0));}
            for (int j = 1; j < wall.get(i).size(); j++) {
                
                int newValue = wall.get(i).get(j - 1) + wall.get(i).get(j);
                if(newValue != temp){
                myList.add(newValue);}
                wall.get(i).set(j, newValue);
            }
        }

        int maxElement = -1;
        int maxFrequency = 0;

         for (int i = 0; i < myList.size(); i++) {
            int currentElement = myList.get(i);
            int currentFrequency = 0;

            for (int j = 0; j < myList.size(); j++) {
                if (myList.get(j) == currentElement) {
                    currentFrequency++;
                }
            }

            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                maxElement = currentElement;
            }
        }

      
        for (int i = 0; i < wall.size(); i++) {
            for (int j = 0; j < wall.get(i).size(); j++) {
                if(wall.get(i).get(j) == maxElement){
                    n--;
                }
            }
        }

        return n;
    }
}