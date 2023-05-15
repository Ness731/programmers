class Solution {
    public int[] solution(String s) {
        int len = 0, i = 0, sum = 0;
        while(!s.equals("1")) {
            len = s.replaceAll("0", "").length();
            sum += s.length() - len;
            s = Integer.toBinaryString(len);
            i++;
        }
        return new int[] {i, sum};
    }
}