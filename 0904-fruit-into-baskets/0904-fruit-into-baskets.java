class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        HashMap<Integer, Integer> bucket = new HashMap<>();
        int i=0;
        int j=0;
        int maxFruits=0;
        while(j<n){
            bucket.put(fruits[j], bucket.getOrDefault(fruits[j],0)+1);
            
            while(bucket.size() > 2){
                bucket.put(fruits[i], bucket.get(fruits[i])-1);
                if(bucket.get(fruits[i]) == 0){
                    bucket.remove(fruits[i]);
                }
                i++;
            }
            maxFruits = Math.max(maxFruits, j-i+1);
            j++;
        }
        return maxFruits;
    }
}