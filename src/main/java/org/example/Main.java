package org.example;

// private 250314

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        사람 a사람 = new 사람();
//        a사람.id = 20;
//        System.out.println(a사람.id);

        // private 변수에 접근하는 방법
        //
        a사람.setId(3);
        System.out.println("번호 : " + a사람.getId());
    }
}

class 사람 {
    // private : 접근제한자 중 하나, 내부에서만 접근할 수 있음
    // 외부에서 직접접근 불가 -> 간접 접근 가능
    // 클래스의 필드는 private로 작성하는 게 관례
    private int id = 11;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // 우클릭 -> Generate -> getter, setter, constructor 알아서 만들어 주기도 함
    // getter
    public int getId() {
        return id;
    }

    // setter
    public void setId(int id) {
         this.id = id;
    }
}

