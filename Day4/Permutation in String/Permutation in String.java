class Solution {
    boolean valid(int[]freq1,int []winfreq){
        for(int i=0;i<26;i++){
            if(freq1[i] !=winfreq[i])
            return false;
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] freq = new int[26];
        int[] winfreq = new int[26];
        int n = s1.length();

        // frequency array fill
        for (int i = 0; i < n; i++) {
            freq[s1.charAt(i) - 'a']++;
            winfreq[s2.charAt(i) - 'a']++;
        }

        // window check
        if (valid(freq, winfreq)) return true;

        // window inc
        for (int i = n; i < s2.length(); i++) {
            winfreq[s2.charAt(i) - 'a']++;               // Add new character
            winfreq[s2.charAt(i - n) - 'a']--;           // Remove old character

            if (valid(freq, winfreq)) return true;
        }

        return false;
    }
}
