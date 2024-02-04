public class Solution {
    public String minWindow(String s, String t) {
        int[] freq = new int[79];

        for(int i = 0; i < t.length(); i++){
            freq[t.charAt(i) - 'A']++;
        }
        int minLength = Integer.MAX_VALUE;
        int minLeft = -1;
        int minRight = -1;
        int start = 0;
        for(int end = 0; end < s.length(); end++){
            freq[s.charAt(end) - 'A']--;
            while(start <= end && check(freq)){
                if( end - start + 1 < minLength){
                    minLength = end - start + 1;
                    minLeft = start;
                    minRight = end;
                }
                freq[s.charAt(start) - 'A']++;
                start++;



            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minLeft, minRight + 1);
    }
    private boolean check(int[] freq){
        for(int x : freq){
            if(x > 0){
                return false;
            }
        }
        return true;
    }
}
