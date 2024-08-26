package kr.co.codingtest;

public class FirstMinus {
    public static void main(String[] args) {
        int[] num_list = {13, 22, 53, 24, 15, 6};
        FM f = new FM();
        f.sol(num_list);
    }
}

class FM {
    public int sol(int[] num_list) {
        int answer;
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i]<0) {
                answer = i;
                return answer;
            }
        }
        answer = -1;
        return answer;
    }
}