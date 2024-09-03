package kr.co.codingtest;

import java.util.Arrays;

public class Seven {
    public static void main(String[] args) {
        int[] arr = {7,77,17};
        Sevens s = new Sevens();
        s.solution(arr);
    }
}

class Sevens {

    public int solution(int[] array) {
        int answer = 0;
        String str = "";
        for(int i = 0; i < array.length; i++) {
            str = Integer.toString(array[i]);
            answer += con(str);
        }

        return answer;
    }

    public int con(String str) {
        return (int) str.chars().filter(c -> c == '7').count();
    }
}