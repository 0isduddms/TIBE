import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List list = new ArrayList();
//
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        System.out.println(list.get(1));

        List list = new ArrayList();

        list.add("public");
        list.add("static");
        list.add("void");

        for (int i = 0; i < list.size();i++) {
            System.out.println(list.get(i));
        }

        list.remove(1);
        int voidIndex = list.indexOf("void");
        System.out.println("void의 index = " + voidIndex);

    }
}