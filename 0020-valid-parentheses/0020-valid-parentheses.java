class Solution {
    public boolean isValid(String s) {
        Stack<Character> box = new Stack<>();
        for(int i =0 ;i < s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{'||ch=='['){
                box.push(ch);
            }else{
                if(box.isEmpty()){
                return false;
            }
            
            if (ch == ')' && box.peek() == '(' ||ch == '}' && box.peek() == '{'||ch == ']' && box.peek() == '[') {
    box.pop();
}else{
    return false;
}
        }
    }
        return box.isEmpty();
}
    }
