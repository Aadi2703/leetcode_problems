class Solution {
    public int maxNumberOfBalloons(String text) {
        String word = "balloon";
        HashMap<Character,Integer> req = new HashMap<>();
        for(int i = 0;i<word.length();i++){
            char ch = word.charAt(i);
            req.put(ch,req.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> comp = new HashMap<>();

         for(int i = 0;i<text.length();i++){
            char ch = text.charAt(i);
              comp.put(ch,comp.getOrDefault(ch,0)+1);
    }
  int answer = Integer.MAX_VALUE;

for (int i = 0; i < word.length(); i++) {
    char ch = word.charAt(i);

    int possible = comp.getOrDefault(ch, 0) / req.get(ch);
    answer = Math.min(answer, possible);
}
return answer;
}
}