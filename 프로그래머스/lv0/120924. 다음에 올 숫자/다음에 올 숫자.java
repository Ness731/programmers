class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int result = isArithmetic(common);
        answer = (result != 0) ? result : isGeometric(common);
        return answer;
    }
    
    public int isArithmetic(int[] arr) {
        // 등차수열의 경우 a + n, a + 2n, a + 3n, ... -> i+1 - i = n
        int diff = arr[1] - arr[0];
        int temp = 0;
        for(int i = 1; i < arr.length - 1; i++) {
            temp = arr[i + 1] - arr[i];
            if(diff != temp)
                return 0;
        }
        return arr[arr.length - 1] + diff;
    }
    
    public int isGeometric(int[] arr) {
        // 등비수열의 경우 a * n, a * n^2, a * n^3... -> i+1 / i = n
        // 0으로 나누는 경우 예외
        if(arr[0] == 0)
            return 0;
        int ratio = arr[1] / arr[0];
        int temp = 0;
        for(int i = 1; i < arr.length - 1; i++) {
            temp = arr[i + 1] / arr[i];
            if(ratio != temp)
                return 0;
        }
        return arr[arr.length - 1] * ratio;
    }
}