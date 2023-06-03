import java.util.Stack;

class Solution {
    public int solution(String s) {
        int i, j, cnt = 0;
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (i = 0; i < arr.length; i++) { // i == start
            stack.clear();
            for (j = 0; j < arr.length; j++) {
                char c = arr[(i + j) % arr.length];
                if (c == ')' || c == '}' || c == ']') { // 닫힌 괄호일 경우 스택 검사 후 pop
                    if (stack.empty())
                        break;
                    else {
                        Character p = stack.peek();
                        if ((p == '(' && c == ')') || (p == '{' && c == '}') || (p == '[' && c == ']')) {
                            stack.pop();
                        } else break;
                    }
                } else // 열린 괄호일 경우 스택에 push
                    stack.push(c);
            }
            if (j == arr.length && stack.empty()) // 순회를 마친 후 모든 요소를 pop 했을 경우
                cnt++;
        }
        return cnt;
    }
}