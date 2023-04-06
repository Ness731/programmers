class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int number = 0;
        int denom = 0;
        int[] answer = {};
        
        // 1. 덧셈을 위한 분모 통일 과정
        if(denom1 == denom2) {
            // 분모가 같으면 통과
        } else if(denom1 % denom2 == 0) { // 어느 한쪽의 분모가 다른 한쪽으로 나누어 떨어진다면 몫만큼 곱한다
            int num = denom1 / denom2;
            denom2 *= num;
            numer2 *= num;
        } else if(denom2 % denom1 == 0) {
            int num = denom2 / denom1;
            denom1 *= num;
            numer1 *= num;
        } else { // 그렇지 않으면 분모만큼 서로 곱한다
            int d1 = denom1;
            int d2 = denom2;
            
            denom1 *= d2;
            numer1 *= d2;
            
            denom2 *= d1;
            numer2 *= d1;
        }
        
        // 2. 분수 덧셈 수행
        number = numer1 + numer2;
        denom = denom1;
        
        // 3. 기약분수 처리
        answer = makeIrreducible(number, denom);
        
        return answer;
    }
    
    public int[] makeIrreducible (int number, int denom) {
        int flag = 0;
        int[] result = new int[2];
        do {
            flag = 0;
            for(int p=2; p<=1000; p++) { // 2~1000 사이의 공약수 찾기
                if((number % p == 0) && (denom % p == 0)) {
                    number /= p;
                    denom /= p;
                    flag = 1;
                }
            }
        } while(flag == 1);
        result[0] = number;
        result[1] = denom;
        return result;
    }
}