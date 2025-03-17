
package org.example;

// HashMap 250317

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Main {
    public static void main(String[] args) {
        // 배열의 단점 : 크기를 미리 설정해야해서 길이를 늘리거나 수정이 불가
        // ArrayList의 단점 : 요소 삽입, 삭제 시 인덱스 번호가 달라진다.

        // hashmap의 장점 : 키와 밸류를 쌍으로 저장할 수 있다. 1:1 대응이 가능하다.
        // ArrayList와 같이 제네릭을 지정할 수 있다.

        // ArrayList -> 객체를 저장할 때 쉬움 / 뺄 때 귀찮음
        // Hashmap -> 객체를 저장할 때 귀찮음 / 뺄 때 쉬움
        //     키(Key), 밸류(Value)
        HashMap<String, Integer> ageMap = new HashMap();

        ageMap.put("케로로나이", 100);
        ageMap.put("쿠루루나이", 100);
        ageMap.put("도로로나이", 100);

        System.out.println("케로로 나이 : " + ageMap.get("케로로나이"));

    }
}

