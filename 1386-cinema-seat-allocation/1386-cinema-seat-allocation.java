class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int count = 0;
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for(int[] i: reservedSeats){
            int row = i[0];
            int seat = i[1];
            if(!map.containsKey(row)){
                map.put(row, new HashSet<Integer>());
            }
            map.get(row).add(seat);
        }
        int result = (n-map.size()) *2;
        for(HashSet<Integer> seats : map.values()){
            boolean left = true;
            boolean middle = true;
            boolean right = true;

            //2,3,4,5
            //4,5,6,7
            // 6,7,8,9
            for(int seat:seats){
                if(seat>=2 && seat<=5){
                    left = false;
                }
                if(seat>=4 && seat <=7){
                    middle = false;
                }
                if(seat>=6 && seat <=9){
                    right = false;
                }
            }
            if(left && right){
                result += 2;
            }else if(left || middle || right){
                result += 1;
            }
        }
        return result;
    }
}