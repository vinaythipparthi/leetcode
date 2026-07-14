class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> li = new ArrayList<Integer>();

        for(int i=1;i<=9;i++){
            int num = 0;
            for(int digit=i;digit<=9;digit++){
                num = (num*10) + digit;
                
                if(num>=low && num<=high){
                    li.add(num);
                }
            }
        }
        Collections.sort(li);
        return li;
    }
}