package org.example;

// 문제 6 : 사람을 말하게 해주세요.
// 문제 7 : 아래 코드가 실행되도록 해주세요.

class Main {
    public static void main(String[] args) {

        사람 man = new 사람();
        man.말하다();

        거북이 a거북이 = new 거북이();

        a거북이.걷다();
        // 출력 => 거북이가 걷다
        a거북이.수영하다();
        // 출력 => 거북이가 수영하다
    }
}

class 사람 {
    // 사람은 `말하다` 라는 기능을 가지고 있습니다.
    void 말하다() {
        System.out.println("사람이 말합니다.");
    }
}

class 거북이 {
    void 걷다(){
        System.out.println("거북이가 걷다");
    }
    void 수영하다(){
        System.out.println("거북이가 수영하다");
    }
}