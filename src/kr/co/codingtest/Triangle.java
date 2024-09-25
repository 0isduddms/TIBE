package kr.co.codingtest;

/*
선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.

가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
삼각형의 두 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 나머지 한 변이 될 수 있는 정수의 개수를 return하도록 solution 함수를 완성해주세요.
 */

public class Triangle {
    public static void main(String[] args) {
        int[] sides = {11,7};
        tri t = new tri();
        t.solution(sides);
    }
}

class tri {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0] > sides[1] ? sides[0] : sides[1];
        int min = sides[0] < sides[1] ? sides[0] : sides[1];
        // 배열 안의 제일 큰 수(a2)가 가장 긴 변일 경우
        // a2 - a1 < x <= a2
        // 배열 이외의 수가 가장 긴 변일 경우
        // a2 < x < a1 + a2
        answer = max - (max - min);
        answer += (max + min) - max - 1;
        return answer;
    }
}