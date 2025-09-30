class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set= new HashSet<>();
        int length=0;
        int start=0;
        int end=0;
        while(end<s.length()){
            char ch=s.charAt(end);
            if(!set.contains(ch)){
                set.add(ch);
                length=Math.max(length,end-start+1);
                end++;// inc window size
            }
            else{// dec size
                set.remove(s.charAt(start));
                start++;
            }
        }
        return length;
    }
}
