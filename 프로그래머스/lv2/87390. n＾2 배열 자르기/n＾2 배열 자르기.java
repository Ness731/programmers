class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left) + 1];
        
        for(int i = 0; i < answer.length; i++) {
            int x = (int)(left / n);
            int y = (int)(left % n);
            left++;
            answer[i] = x > y ? x+1 : y+1;
        }
        return answer;
    }
}