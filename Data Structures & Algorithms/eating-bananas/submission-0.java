class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low =1,high=1;

        for(int pile:piles){
            high=Math.max(high,pile);

        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canFinsh(piles,mid,h)){
                                high=mid-1;

            }else{
                                low=mid+1;

            }
        }
        return low;
    } 
    private static boolean canFinsh(int[]piles,int speed,int h){
        long hours=0;
        for(int pile:piles){
            hours+=Math.ceil((double) pile/speed);
        }
        return hours<=h;
    }
}
