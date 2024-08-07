public class TorF {
    public static void main(String[] args) {
        String str1 = new String("is same?");
        String str2 = new String("is same?");

        System.out.println("str1 == str2을 사용했을 때");
        System.out.println(str1 == str2); // true or false?
        System.out.println();
        System.out.println("str1.equals(str2)를 입력했을 때");
        System.out.println(str1.equals(str2));

    }
}
