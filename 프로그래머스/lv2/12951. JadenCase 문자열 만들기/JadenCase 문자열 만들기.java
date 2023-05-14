class Solution {
    public String solution(String str) {
        String[] arr = str.split(" ", -1); // 공백 문자도 배열에 포함
        String jaden = "";
        int i = 0;
        for(String s : arr) {
            if(!s.isEmpty()){
               jaden += (s.charAt(0)+"").toUpperCase();
               if(s.length() > 1)
                   jaden += s.toLowerCase().substring(1);
            }
            if(i++ < arr.length - 1)
                jaden += " ";
        }
        return jaden;
    }
}