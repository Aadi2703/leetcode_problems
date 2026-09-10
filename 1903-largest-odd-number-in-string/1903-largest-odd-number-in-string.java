class Solution {
    public String largestOddNumber(String num) {
        int last = num.length()-1;
        while(last>=0){
int digit = num.charAt(last)-'0';
            if(digit%2!=0){
return num.substring(0,last+1);
            }
last--;

        }    
        return "";
    }
}