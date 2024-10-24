/* 316. Remove Duplicate Letters
Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is 
the smallest in lexicographical order
 among all possible results.

 

Example 1:

Input: s = "bcabc"
Output: "abc"
Example 2:

Input: s = "cbacdcbc"
Output: "acdb"*/
 

class Solution {
    public String removeDuplicateLetters(String str) {
        HashMap<Character,Integer> fre = new HashMap<>();
        for(char c : str.toCharArray()){
            fre.put(c,fre.getOrDefault(c,0)+1);
                // freq.put(c, freq.getOrDefault(c, 0) + 1);
        }


        Stack<Character> s = new Stack<>();
        HashSet<Character> visited = new HashSet<>();

        for(char c : str.toCharArray()){
            fre.put(c,fre.get(c)-1);

            if(visited.contains(c)){
                continue;
            }

            while(!s.isEmpty() && s.peek() > c && fre.get(s.peek()) > 0){
                visited.remove(s.pop());
            }

            s.push(c);
             visited.add(c);
        }


         StringBuilder result = new StringBuilder();
        for (char c : s) {
            result.append(c);
        }

        return result.toString();
    }
}