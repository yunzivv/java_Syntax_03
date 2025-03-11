package org.example;

// 문제 3 : 아래와 같이 출력 되도록 해주세요.

class Main {
    public static void main(String[] args) {
        int 결과1 = Math.nToMSum(2, 3);
        System.out.println("결과1 : " + 결과1);
        // 출력 : 결과1 : 5

        int 결과2 = Math.nToMSum(5, 10);
        System.out.println("결과2 : " + 결과2);
        // 출력 : 결과2 : 45
    }
}

class Math {
    static int nToMSum(int a, int b){
        int sum = 0;
        for(int i = a; i <= b; ++i){
            sum += i;
        }
        return sum;
    }
}