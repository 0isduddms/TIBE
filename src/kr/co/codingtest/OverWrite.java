package kr.co.codingtest;

public class OverWrite {
    public static void main(String[] args) {
        Over o = new Over();
        o.solution("Program29b8UYP","merS123",7);
    }
}

class Over {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer += my_string.substring(0,s);
        answer += overwrite_string;
        answer += my_string.substring(s+overwrite_string.length());
        System.out.println(answer);
        return answer;

    }

}
