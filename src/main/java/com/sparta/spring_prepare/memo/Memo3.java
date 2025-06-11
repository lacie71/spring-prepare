package com.sparta.spring_prepare.memo;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor // final과 @NonNull이 붙은 필드를 파라미터로 가지는 오버로딩된 생성자
public class Memo3 {
    private final String username;
    private String contents;
}


// 롬복을 사용하지 않는 경우 아래와 같이 명시적으로 기본생성자를 포함한 생성자를 만들어 주어야 함
//public class Memo3 {
//    private String username;
//    private String contents; // 생성자에 포함되지 않았으므로 초기값은 null. @Setter나 setContents()를 통해서 값을 설정할 수 있음
//
//    public Memo3() {
//    }
//
//    public Memo3(String username) {
//        this.username = username;
//    }
//}