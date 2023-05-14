import java.util.stream.Stream;

class Solution {
    public String solution(String s) {
        int[] arr = Stream.of(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        int max = arr[0], min = arr[0];
        for(int n : arr) {
            if(n > max)
                max = n;
            if(n < min)
                min = n;
        }
        return min + " " + max;
    }
}