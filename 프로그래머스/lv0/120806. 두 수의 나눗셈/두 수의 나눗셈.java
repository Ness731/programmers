class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        float temp = (float) num1 / (float) num2 * 1000;
        answer = (int) temp;
        return answer;
    }
}