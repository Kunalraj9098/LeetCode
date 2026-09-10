class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        return helper(rooms, 0, new HashSet<Integer>());        
    }
    
    private boolean helper(List<List<Integer>> rooms, 
                          int key, Set<Integer> seen){
        seen.add(key);
        List<Integer> keys = rooms.get(key);
        for(int k : keys){
            if(!seen.contains(k))
            helper(rooms, k, seen);
        }
        return seen.size()==rooms.size();
    }
}
