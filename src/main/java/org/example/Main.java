package org.example; // 없으면 안됨


// 문제 : 할인 대상인지 아닌지 출력해주세요.
// 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
// 조건 : 출력예시 처럼 출력되어야 합니다.
// 조건 : `구현시작` 부분만 수정 할 수 있습니다.
// 조건 : 4가지 이상의 방법으로 풀어야 합니다.
// 조건 : 그 중 2가지 방법은 `&&, ||`없이 풀어야 합니다.

class Main {
    public static void main(String[] args) {
        int age = 60; // 이 값을 바꿔가면서 실행해보세요.

        System.out.println("당신의 나이는 " + age + "살 입니다.");

        // 구현시작
        System.out.println("==== v1 ====");
        if (age > 59 || age < 20){
            System.out.println("할인대상");
        } else {
            System.out.println("할인대상 아님");
        }

        System.out.println("==== v2 ====");
        if (age > 19 && age < 60){
            System.out.println("할인대상 아님");
        } else {
            System.out.println("할인대상");
        }

        System.out.println("==== v3 ====");
        if ( age < 20 ){
            System.out.println("할인대상");
        } else if (age > 59){
            System.out.println("할인대상");
        } else {
            System.out.println("할인대상 아님");
        }

        System.out.println("==== v4 ====");
        if ( age < 20 ){
            System.out.println("할인대상");
        } else if (age > 59){
            System.out.println("할인대상");
        } else if (age > 19 && age < 60){
            System.out.println("할인대상 아님");
        }

        System.out.println("==== v5 ====");
        if ( age < 20 ){
            System.out.println("할인대상");
        } else if (age > 59){
            System.out.println("할인대상");
        } else if (age < 60 && age > 19){
            System.out.println("할인대상 아님");
        }

        System.out.println("==== v6 ====");
        if (age < 20 || age > 59){
            System.out.println("할인대상");
        } else if (age > 19 && age < 60){
            System.out.println("할인대상 아님");
        }

        System.out.println("==== v7 ====");
        if (age < 20 || age > 59){
            System.out.println("할인대상");
        }
        if (age > 19 && age < 60){
            System.out.println("할인대상 아님");
        }


        System.out.println("==== v8 ====");
        if (age < 20){
            System.out.println("할인대상");
        }
        if (age > 59){
            System.out.println("할인대상");
        }
        if (age > 19 && age < 60){
            System.out.println("할인대상 아님");
        }

        System.out.println("==== v9 ====");
        if (age < 20){
            System.out.println("할인대상");
        }
        if (age > 59){
            System.out.println("할인대상");
        }
        if (age >= 20){
            if(age <= 59){
                System.out.println("할인대상 아님");
            }
        }

        System.out.println("==== v10 ====");
        if (age > 59) {
            System.out.println("할인대상");
        } else {
            if(age < 20){
                System.out.println("할인대상");
            }
            else{
                System.out.println("할인대상 아님");
            }
        }

        // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.
    }
}