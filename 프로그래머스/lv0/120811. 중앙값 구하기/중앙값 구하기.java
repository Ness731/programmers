class Solution {
    public int solution(int[] arr) {
        return sort(arr, 0, arr.length);
    }
    public int sort(int[] arr, int start, int end) {
        if(start != end) {
            int temp = 0;
            for(int i = start+1; i < end; i++) {
                if(arr[start] > arr[i]) {
                    temp = arr[start]; //swap
                    arr[start] = arr[i];
                    arr[i] = temp;
                }
            } //최솟값이 시작 인덱스로 위치하게됨
            sort(arr, start + 1, end);
        }
        return arr[arr.length / 2];
    }
}