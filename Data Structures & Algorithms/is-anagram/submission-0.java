class Solution {
    public boolean isAnagram(String s, String t) {

        int[] freqS= new int [26];

        for (char ch : s.toCharArray()){
            int index = ch-'a';
            freqS[index]++;
        }

        for (char ch: t.toCharArray()){
            int index = ch-'a';
            freqS[index]--;
        }

        for (int freq: freqS){
            if (freq!=0){
                return false;
            }
        }
        return true ;



    }
}
