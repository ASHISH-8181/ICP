class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result; // answer is not possible if p greater

        int[] pfreq = new int[26];// freq for p string
        int[] winfreq = new int[26];// f4req check for window
        int winsize = p.length();

        // Build frequency array for p
        for (int i = 0; i < winsize; i++) {
            pfreq[p.charAt(i) - 'a']++;
            winfreq[s.charAt(i) - 'a']++;
        }

        // Check  window
        if (Arrays.equals(pfreq, winfreq)) {
            result.add(0);
        }

        // window slide
        for (int i = winsize; i < s.length(); i++) {
            winfreq[s.charAt(i) - 'a']++; // Add  char
            winfreq[s.charAt(i - winsize) - 'a']--; // Remove  char

            if (Arrays.equals(pfreq, winfreq)) {
                result.add(i - winsize + 1);
            }
        }

        return result;
    }
}
