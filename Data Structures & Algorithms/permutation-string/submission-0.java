class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int [] need = new int[26];
        int [] window = new int[26];

        for (char ch : s1.toCharArray()){
            need[ch-'a']++;
        }

        int left = 0;

        for (int right=0; right<s2.length(); right++){
            char ch = s2.charAt(right);

            window[ch-'a']++;

            if (right-left+1 > s1.length()){
                window[s2.charAt(left)-'a']--;
                left++;
            }

            if (right-left+1 == s1.length()){
                if (Arrays.equals(window,need)){
                    return true;
                }
            }
            
        }

        return false;
        
    }
}
