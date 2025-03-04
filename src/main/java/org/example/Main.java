package org.example; // 없으면 안됨


// 문제 : 실행되는 출력문에는 참 그렇지 않으면 거짓 이라고 적어주세요.

class Main {
    public static void main(String[] args) {
        int age = 38;

        if (10 > age && age > 0){
            System.out.println("영유아");
        }
        else if (20 > age){ // 양립할 수 없음 -> 무조건 한가지만 참
            System.out.println("10대");
        }
        else if (30 > age){ // python의 elif와 같은 작동
            System.out.println("20대");
        }
        else if (40 > age){
            System.out.println("30대");
        }
        else {
            System.out.println("40대 이상");
        }
    }
}