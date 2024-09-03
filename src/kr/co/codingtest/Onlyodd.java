package kr.co.codingtest;

import java.util.ArrayList;

public class Onlyodd {
    public static void main(String[] args) {
        Odd m = new Odd();
        m.solution(15);

    }
}

class Odd {
    public ArrayList solution(int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int num = 1; num <= n;num += 2){
            answer.add(num);
        }
        return answer;
    }
}