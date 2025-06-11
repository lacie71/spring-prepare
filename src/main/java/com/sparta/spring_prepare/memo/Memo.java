package com.sparta.spring_prepare.memo;

import lombok.*;

//@NoArgsConstructor - 파라미터를 가지지 않은 기본생성자
//@AllArgsConstructor - 모든 필드를 파라미터로 가지는 오버로딩된 생성자
//@RequiredArgsConstructor - final을 가지는 필드를 파라미터로 가지는 오버로딩된 생성자
@Getter
@Setter
public class Memo {
    private String username;
    private String contents;
}

class Main {
    public static void main(String[] args) {
        Memo memo = new Memo();
        memo.setUsername("lacie");
        System.out.println(memo.getUsername());
    }
}