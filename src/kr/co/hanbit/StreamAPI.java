package kr.co.hanbit;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("public");
        list.add("static");
        list.add("void");

//        for (int i = 0; i < list.size();i++) {
//            System.out.println(list.get(i));
//        }

        //위의 for 문을 stream API로 표현
        list.stream().forEach(str -> System.out.println(str));
    }
}
