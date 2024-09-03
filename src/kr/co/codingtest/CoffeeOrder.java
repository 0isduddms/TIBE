package kr.co.codingtest;

public class CoffeeOrder {
    public static void main(String[] args) {
        String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
        Order n = new Order();
        n.solution(order);
    }
}

class Order {
    public int solution(String[] order) {
        int answer = 0;
        for (int i = 0; i < order.length; i++){
            if(order[i].contains("americano") || order[i].equals("anything")){
                answer += 4500;
            }
            else {
                answer += 5000;
            }
        };
        return answer;
    }
}