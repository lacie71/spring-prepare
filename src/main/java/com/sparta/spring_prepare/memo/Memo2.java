package com.sparta.spring_prepare.memo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor  // 파라미터를 가지지 않은 기본생성자
@AllArgsConstructor // 모든 필드를 파라미터로 가지는 오버로딩된 생성자
public class Memo2 {
    private String username;
    private String contents;
}


// 롬복을 사용하지 않는 경우 아래와 같이 명시적으로 기본생성자를 포함한 생성자를 만들어 주어야 함
//public class Memo2 {
//    private String username;
//    private String contents;
//
//    public Memo2() {
//    }
//
//    public Memo2(String username, String contents) {
//        this.username = username;
//        this.contents = contents;
//    }
//}