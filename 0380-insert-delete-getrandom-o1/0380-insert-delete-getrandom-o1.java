class RandomizedSet {

    HashSet<Integer> randomizedSet;
    
    public RandomizedSet() {
        randomizedSet = new HashSet();
    }
    
    public boolean insert(int val) {
        if(randomizedSet.contains(val))
        {
            return false;
        }
        randomizedSet.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(randomizedSet.contains(val))
        {
            randomizedSet.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        ArrayList<Integer> ar=new ArrayList(randomizedSet);
        int size = randomizedSet.size();
        int total = (int)(Math.random()*size);
        return ar.get(total);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */