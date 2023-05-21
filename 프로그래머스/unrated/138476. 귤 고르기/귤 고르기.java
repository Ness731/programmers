import java.util.Arrays;

class Solution {
     public int solution(int k, int[] tangerine) {
        int[] cnt = new int[tangerine.length];
        int remain = k, result = 0, idx = 0;;
         
        Arrays.sort(tangerine);
        for(int i = 0; i < tangerine.length; i++) {
            cnt[idx]++;
            if(i < tangerine.length - 1 && tangerine[i] != tangerine[i+1])
                idx++;
        }
         
        Arrays.sort(cnt); 
        for(int i = cnt.length-1; i >= 0; i--) {
            if(cnt[i] >= remain)
                return result+1;
            remain -= cnt[i];
            result++;
        }
        return result;
    }
}