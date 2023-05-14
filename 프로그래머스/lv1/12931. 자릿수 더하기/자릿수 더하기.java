import java.util.*;

public class Solution {
    public int solution(int n) {
        String str = Integer.toString(n);
        int sum = 0;
        for(int i=Integer.toString(n).length() - 1; i >= 0; i--) {
            sum += Character.getNumericValue(str.charAt(i));
        }
        return sum;
    }
}