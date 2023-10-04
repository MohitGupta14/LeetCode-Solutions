import java.util.ArrayList;

class MyHashMap {
    private ArrayList<ArrayList<Integer>> map;

    public MyHashMap() {
        map = new ArrayList<>();
    }

    public void put(int key, int value) {
        boolean found = false;
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).get(0) == key) {
                map.get(i).set(1, value); // Update the value associated with the key
                found = true;
                break;
            }
        }
        if (!found) {
            ArrayList<Integer> innerMap = new ArrayList<>();
            innerMap.add(key);
            innerMap.add(value);
            map.add(innerMap);
        }
    }

    public int get(int key) {
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).get(0) == key) {
                return map.get(i).get(1);
            }
        }
        return -1; 
    }

    public void remove(int key) {
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).get(0) == key) {
                map.remove(i);
                break; 
            }
        }
    }
}
