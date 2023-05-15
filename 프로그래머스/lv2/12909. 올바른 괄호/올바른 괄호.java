class Solution {
    boolean solution(String s) {
        if(s.charAt(s.length()-1) == '(' || s.charAt(0) == ')')
            return false;
        int cnt = 0; // cnt == stack size
        for(char c : s.toCharArray()) {
            if(cnt < 0) // stack underflow
                return false;
            if(c == '(') 
                cnt++; // push
            else 
                cnt--; // pop
        }
        if(cnt == 0) 
            return true;
        return false;
    }
}