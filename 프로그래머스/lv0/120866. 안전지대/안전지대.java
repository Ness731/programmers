import java.util.ArrayList;

class Solution {
    public int solution(int[][] board) {
        int n = board[0].length;
        int[][] danger = new int[n][n];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 1) {
                    // 지뢰라면 주변 좌표를 위험지역 리스트에 추가
                    danger[i][j] = 1;
                    if(i > 0)
                        danger[i - 1][j] = 1;
                    if(i < n-1)
                        danger[i + 1][j] = 1;
                    if(j > 0)
                        danger[i][j - 1] = 1;
                    if(j < n-1)
                        danger[i][j + 1] = 1;   
                    if(i > 0 && j > 0) 
                        danger[i - 1][j - 1] = 1;
                    if(i < n-1 && j < n-1)
                        danger[i + 1][j + 1] = 1;
                    if(i < n-1 && j > 0)
                        danger[i + 1][j - 1] = 1;
                    if(i > 0 && j < n-1)
                        danger[i - 1][j + 1] = 1;
                }
            }
        }
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(danger[i][j] == 0) cnt++;
            }
        }
        return cnt;
    }
}