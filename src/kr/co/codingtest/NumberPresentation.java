package kr.co.codingtest;

public class NumberPresentation {
    public static void main(String[] args) {
        NumPre n = new NumPre();
        n.solution(15);
    }
}

class NumPre {
    public int solution(int n) {
        int answer = 0;
        int plus = 0;
        for (int i = 1; plus < n; i++) {
            if((n - plus) % i == 0) answer += 1;
            plus += i;
        }
        System.out.println(answer);
        return answer;
    }
}