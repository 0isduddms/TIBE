package kr.co.codingtest;

/*
2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다.
직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때,
직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.
 */

public class SquarArea {
    public static void main(String[] args) {
        int[][] dots = {{-1,-1},{1,1},{-1,1},{1,-1}};

        Squar s = new Squar();
        s.solution(dots);
    }
}

class Squar {
    public int solution(int[][] dots) {
        int x = 0;
        int y = 0;
        for(int i = 0; i < dots.length -1; i++) {
            if (dots[i][1] == dots[3][1]) {
                x = Math.max(dots[3][0],dots[i][0]) - Math.min(dots[3][0],dots[i][0]);
            }
            if (dots[i][0]==dots[3][0]) {
                y = Math.max(dots[3][1],dots[i][1]) - Math.min(dots[3][1],dots[i][1]);
            }
        }

        return x * y;
    }
}