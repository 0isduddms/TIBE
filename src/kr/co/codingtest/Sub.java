package kr.co.codingtest;

public class Sub {
    public static void main(String[] args) {
        Multiply mul = new Multiply();
        mul.mul();
    }
}
class Increase {
    public int PlusA(int a) {
        return ++a;
    }

    public int PlusB(int b){
        return ++b;
    }
}
class Multiply{
    public int mul() {
        int a = 2;
        int b = 1;
        int c = a * b;
        Increase A = new Increase();
        Increase B = new Increase();
        for (; a<10;) {
            System.out.println();
            System.out.println(a+"단");
            System.out.println(a + " * " + b + " = " + c);
            for(; b<10;) {
                c = a * b;
                System.out.println(a + " * " + b + " = " + c);
                b = B.PlusB(b);
            }
            a = A.PlusA(a);
            b = 1;
        }

        return 0;
    }
}