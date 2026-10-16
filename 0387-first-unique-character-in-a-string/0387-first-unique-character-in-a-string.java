class Solution {
    public int firstUniqChar(String s) {
//         for(int i = 0;i<s.length();i++){
// boolean flag = true;
// for(int j = 0 ;j<s.length();j++){
//     if(i !=j && s.charAt(i)==s.charAt(j)){
// flag = false;
//     }
// }
// if(flag){      //brute force approach
//     return i;
// }


//         }
//         return -1;
HashMap<Character , Integer> freq = new HashMap<>();
for(int i =0 ;i <s.length();i++){
char ch= s.charAt(i);
freq.put(ch , freq.getOrDefault(ch,0)+1);
}
for(int i =0 ;i <s.length();i++){
char ch= s.charAt(i);
if(freq.get(ch)==1){
    return i;
}

}
return -1;
    } 
}
