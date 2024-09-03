package kr.co.codingtest;

import java.util.Dictionary;
import java.util.HashMap;

public class Mostnumber {
    public static void main(String[] args) {
        int[] array = {2, 1, 2, 1, 2, 3, 3};
        Mn n = new Mn();
        n.solution(array);
    }
}

class Mn {
    public int solution(int[] array) {
        int answer = 0;
        int n = 0;
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for (int i = 0; i < array.length; i++) {
            if (hash.get(array[i]) == null) {
                hash.put(array[i],1);
            }
            else {
                hash.put(array[i],hash.get(array[i]) + 1);
            }
            if (n < hash.get(array[i])) {
                n = hash.get(array[i]);
                answer = array[i];
            } else if (n == hash.get(array[i])) {
                answer = -1;
            }
        }

        return answer;
    }
}