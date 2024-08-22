package kr.co.codingtest;

public class Sub {
    public static void main(String[] args) {
        Multiply mul = new Multiply();
        mul.mul();
    }
}
class Increase {
    public int plus(int a) {
        return ++a;
    }
}
class Multiply{
    public int mul() {
        int a = 2;
        int b = 1;
        int c = a * b;
        Increase D = new Increase();
        for (; a<10;) {
            System.out.println(a+"단");
            for(; b<10;) {
                c = a * b;
                System.out.println(a + " * " + b + " = " + c);
                b = D.plus(b);
            }
            a = D.plus(a);
            b = 1;
            System.out.println();
        }

        return 0;
    }
}