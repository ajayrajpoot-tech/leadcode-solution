class Solution {
    public boolean isAnagram(String s, String t) {
        int slength=s.length();
        int tlength=t.length();
        int[] count=new int[26];
        if(slength!=tlength){
            return false;
        }
        for(char ch:s.toCharArray()){
            count[ch-97]++;
        }
           for(char ch:t.toCharArray()){
            count[ch-97]--;
        }
        for(int value:count){
            if(value!=0){
                return false;
            }
        }
        return true;
    }
}