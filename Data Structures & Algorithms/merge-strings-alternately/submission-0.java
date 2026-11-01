class Solution {
    public String mergeAlternately(String word1, String word2) {
        int left=0,right=0;
        StringBuilder res = new StringBuilder();
        while(left<word1.length() || right<word2.length()){
            if(left<word1.length()){
                char ch1= word1.charAt(left);
                res.append(ch1);
                left++;

            }
            if(right<word2.length()){
                char ch2 = word2.charAt(right);
                res.append(ch2);
                right++;
            }
        }
        return res.toString();
    }
}