class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        if(num == 1) { // 개수가 1개인 경우
            answer[0] = total;
            return answer;
        }
        
        int middle = total / num;
        int idx = 0;
        
        if(num % 2 == 0) { // 개수가 짝수일 경우
            for(int i= middle - (num / 2 - 1); i <= middle + (num / 2); i++)
                if(idx < num) 
                    answer[idx++] = i;
        }
        else { // 개수가 홀수일 경우
            for(int i = middle - (num / 2); i<= middle + (num / 2); i++)
                if(idx < num) 
                    answer[idx++] = i;
        }
        return answer;
    }
        
}