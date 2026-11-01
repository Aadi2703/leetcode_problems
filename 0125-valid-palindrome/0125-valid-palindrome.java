class Solution {
    public boolean isPalindrome(String s) {
       int right = s.length()-1; 
       int left = 0;
       while(left<right){
if(!Character.isLetterOrDigit(s.charAt(left))){
    left++;
}
else if(!Character.isLetterOrDigit(s.charAt(right))){
    right--;
}
else{
    char a= Character.toLowerCase(s.charAt(left));
        char b= Character.toLowerCase(s.charAt(right));

        if(a!=b){
            return false;
        }
left++;
right--;
}



       }
       return true;
    }
}