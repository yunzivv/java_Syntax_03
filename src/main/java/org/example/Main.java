package org.example;

// 문제 8 : 클래스 5개 이상 만들고 각각을 객체화 하여 메서드를 호출해주세요.

class Main {
    public static void main(String[] args) {
        one a = new one();
        a.oneFun();

        two b = new two();
        b.twoFun();

        three c = new three();
        c.threeFun();

        four d = new four();
        d.fourFun();

        five e = new five();
        e.fiveFun();
    }
}

class one {
    void oneFun() {
        System.out.println("one");
    }
}

class two {
    void twoFun() {
        System.out.println("two");
    }
}

class three {
    void threeFun() {
        System.out.println("three");
    }
}

class four {
    void fourFun() {
        System.out.println("four");
    }
}

class five {
    void fiveFun() {
        System.out.println("five");
    }
}