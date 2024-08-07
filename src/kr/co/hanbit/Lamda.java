package kr.co.hanbit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lamda {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("public");
        list.add("static");
        list.add("void");

        //익명 클래스 코드
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str1.compareTo(str2);
            }
        });

        //람다 표현식 코드
        list.sort((Comparator<String>) (str1, str2) -> str1.compareTo(str2));

        //파라미터 1개, 명령문 1개인 경우
        //var1 -> System.out.println(var1);

        //파라미터 1개, 명령문 2개인 경우
        //var1 -> {
        //  var1 = var1 +1;
        //  System.out.println(var1);
        //  return var1;
        //}

        //파라미터 2개 이상, 명령문 1개인 경우
        //(var1,var2) -> System.out.println(var1 + var2);

        //파라미터 2개 이상, 명령문 2개 이상인 경우
        //(var1,var2) -> {
        //  System.out.println(var1);
        //  System.out.println(var2);
        //}
    }
}
