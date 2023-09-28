class Solution {
    public int maxVowels(String s, int k) {
        int count= 0;
        int maxCount = 0;
        int n = s.length();
        int r = 0;
        Queue<Character> list = new LinkedList<>();

        while(r<n){

            list.add(s.charAt(r));
            if(list.size() == k+1){
                if(check(list.peek())){
                    count--;
                }
                list.remove();
            }

            if(check(s.charAt(r))){
                count++;
                maxCount = Math.max(count,maxCount);
            }
            r++;
        }

        return maxCount;
    }

    public boolean check(char c){

        if(c == 'a' || c == 'e'|| c == 'i'|| c == 'o' || c == 'u'){
            return true;
        }

        return false;
    }
}