package kr.co.codingtest;

public class LoginPF {
    public static void main(String[] args) {
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        Login l = new Login();
        l.solution(id_pw, db);
    }
}

class Login {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for (int i = 0; i < db.length; i++) {
            if (db[i][0].equals(id_pw[0])) {
                if (db[i][1].equals(id_pw[1])) {
                    answer = "login";
                    break;
                } else {
                    answer = "wrong pw";
                    break;
                }
            }
        }
        System.out.println(answer);
        System.out.println(id_pw[0] +", " +db[0][0]);
        return answer;
    }
}