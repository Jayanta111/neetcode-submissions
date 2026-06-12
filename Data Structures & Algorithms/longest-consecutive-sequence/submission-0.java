class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>numSet=new HashSet<>();

        int lcs=1;
        if(nums.length==0){
            return 0;
        }
        for(int num:nums){
            numSet.add(num);
        }

        for(int num:numSet){
            if(numSet.contains(num-1)){
                continue;
            }
            else{
                int currNum=num;
                int currSub=1;

                while(numSet.contains(currNum+1)){
                    currNum++;
                    currSub++;
                }
                lcs=Math.max(lcs,currSub);
            }
        }
        return lcs;
    }
}
