package kr.co.codingtest;

public class Factorial {
    public static void main(String[] args) {
        Number num = new Number();
        num.num(3628800);
    }
}

class Number{
    public int num(int n) {
        int m = 1;
        int i = 1;
        for (; m<n; i++) {
            m *= i;
            if(m>n)
                return --i;
        }
        System.out.println(i);
        return --i;
    }
}