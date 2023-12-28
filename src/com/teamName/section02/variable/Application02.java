package com.teamName.section02.variable;
//변수명을 할당할 때 통상적으로 자주 사용하는 작명법에 대하여 서술한다.
public class Application02
{
    public static void main(String[] args)
    {
        //변수의 명명규칙에 대해 이해할 수 있다.
        //<단점>
        // 1. 컴파일 에러를 발생시키는 규칙
        // 2. 컴파일 에러를 발생시키지 않지만 개발자끼리의 암묵적 규칙

        // <컴파일 에러를 발생시킬 수 있는 규칙>
        // 1. 동일한 범위 내에서 동일한 변수명을 가질 수 없다.
        // 2. 변수의 이름에는 자바에서 사용중인 키워드를 사용할 수 없다.
        // 3. 변수의 이름은 영문자 대소문자를 구분한다.
        // 4. 변수의 이름은 숫자로 시작할 수 없다.
        // 5. 특수기호는 '-'와 '$'만 사용 가능하다

        // <컴파일 에러를 발생시키지는 않지만 개발자들끼리의 암묵적인 규칙>
        // 1. 변수명의 길이 제한은 없다.
        // 2. 변수명이 합성어로 이루어진 경우 첫 단어는 소문자, 두번째 시작단어는 대문자로 시작한다(camel-case)
        // ex)  boolean isTrue
        // 3. 단어와 단어 사이의 연결을 언더스코어로 하지 않는다 (타 언어 네이밍 규칙이다)
        // 4. 한글로 변수명을 짓는 것이 가능하지만 권장하지 않는다 (한글을 취급하는 다양한 방식들이 존재하기 때문에 에러를 유발 할 수 있다.
        // 5. 변수 안에 저장된 값이 어떤 의미를 가지는지 명확하게 표현하도록 한다.
        // 6 전형적인 변수 이름이 있다면 가급적 사용하도록 한다.
        int sum = 0;
        int max = 10;
        int min = 0;
        int count = 1;
        // 7. 명사형으로 작성할 수 있도록 한다
        String goHome;  //가능하긴 하지만 가급적 명사형으로 적는다
        String home;
        // 8. boolean 형은 의문문으로 가급적 긍정형태로 네이밍한다.
        boolean isAlive = true;
    }}
