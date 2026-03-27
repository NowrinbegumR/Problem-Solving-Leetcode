class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String Double = s + s;
        String t = Double.substring(1,Double.length()-1);
        return t.contains(s);
        
    }
}