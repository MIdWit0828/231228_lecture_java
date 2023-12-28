package com.teamName.secton01.literal;
//패키지 3개이상의 폴더로 관리하는 편이 좋다.
//
public class Application01
{

    public static void main(String[] args)  
    {
        System.out.println(123);
        //출력메소드 단축sout로 한번에 출력할 수 있다.
        //ln은 line이라는 의미이다. : 출력 후 개행한다.
        System.out.println(1.23);

        //문자 형태의 값
        System.out.println('a');    //문자 형태의 값은 홑따옴표로 감싸주어야 한다.
        System.out.println('1');    //숫자 값이지만 홑따옴표로 감싸져 있는 경우 문자 '1'이라고 판단한다.
        System.out.println('\n');
        // 두 개 이상은 문자로 취급하지 않는다.    아무 문자도 기록되지 않는 경우도 에러가 발생한다.

        //문자열 혈태의 값
        System.out.println("안녕하세요");    //문자열은 문자 여러 개가 나열된 형태를 말하며 쌍따옴표로 감싸주어야 한다
        System.out.println("123");          // 정수이지만 쌍따옴표로 감싸져 있기 떄ㅜㅁ네 문자열로 보아야 한다.
        System.out.println("");             // 아무 값고 없는 빈 쌍따옴표도 문자열로 취급한다.
        System.out.println("a");            // 한 개의 문자도 쌍따옴표로 감싸면 문자열이다.

        //논리 형태의 값
        System.out.println(true);
        System.out.println(false);
        System.out.println(123123);

    }
}