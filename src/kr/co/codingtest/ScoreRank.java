package kr.co.codingtest;

public class ScoreRank {
    public static void main(String[] args) {
        Ranking r = new Ranking();
        int[][] score = {{80,70},{70,80},{30,50},{90,100},{100,90},{100,100},{10,30}};
        r.solution(score);
    }
}

class Ranking{
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            answer[i] += 1;
            for (int j = 0; j < score.length - 1; j++) {
                if (i == j) break;
                if ((double)(score[i][0] + score[i][1]) / 2 < (double) (score[j][0] + score[j][1]) / 2) {
                    answer[i] += 1;
                }
                else if ((double)(score[i][0] + score[i][1]) / 2 > (double)(score[j][0] + score[j][1]) / 2) {
                    answer[j] += 1;
                }
            }
        }
        return answer;
    }
}
