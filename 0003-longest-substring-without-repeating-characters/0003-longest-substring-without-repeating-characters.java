class Solution {
    public int lengthOfLongestSubstring(String s){
    ArrayList<Character> list = new ArrayList<>();
    int maxlength =0;
    for(int i =0 ; i < s.length();i++){
        char ch = s.charAt(i);
    while(list.contains(ch)){
list.remove(0);
    } 
        list.add(ch);
        maxlength = Math.max(maxlength,list.size());
    }
    return maxlength;
    }
}