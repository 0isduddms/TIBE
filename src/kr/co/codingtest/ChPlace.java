package kr.co.codingtest;

public class ChPlace {
    public static void main(String[] args) {
        String[] keyinput = {"left", "left", "left", "left", "right", "right", "right", "right"};
        int[] board = {5,5};
        Move m = new Move();
        m.solution(keyinput, board);
    }
}

class Move {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        for(int i = 0; i < keyinput.length; i++) {
            switch (keyinput[i]) {
                case ("right") : answer[0] += 1;
                    break;
                case "left" : answer[0] -= 1;
                    break;
                case "up" : answer[1] += 1;
                    break;
                case "down" : answer[1] -= 1;
                    break;
                default: break;
            }
            if(answer[0] < -board[0] / 2) answer[0] = -board[0] /2;
            else if (answer[0] > board[0] / 2) answer[0] = board[0] / 2;
            if(answer[1] < -board[1] / 2) answer[1] = -board[1] /2;
            else if (answer[1] > board[1] / 2) answer[1] = board[1] / 2;
        }

        return answer;
    }
}