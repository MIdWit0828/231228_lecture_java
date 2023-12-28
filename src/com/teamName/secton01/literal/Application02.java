package com.teamName.secton01.literal;

public class Application02 //클래스명은 대문자로 한다(개발자 끼리의 약속).
{
    public static void main(String[] args)
    {
        // 값을 직접 연산하여 출력할 수 있다.
        // 이때, 값의 형태에 따라 사용할 수 있는 연산자의 종류와 연산의 결과가 달라진다.
        System.out.println("===== 정수와 정수의 연산 =====");
        System.out.println(123 + 123);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 11 + "\n"); //mod연산자 : 나누기를 한 뒤 나머지를 표기한다.

        System.out.println("===== 실수와 실수의 연산 =====");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10f);
        System.out.println(1.23 / 10f);
        System.out.println(1.23 % 1f + "\n"); //약간의 오차가 생긴다
        // 부동소수점 : 소수점 이하의 위치를 고정하지 않고 가수와 지수로 나타내는 방식의 실수 표현 방식을 말한다

        System.out.println("===== 정수와 실수의 연산 =====");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5 + "\n");

        System.out.println("===== 문자와 문자의 연산 =====");
        System.out.println('a'+'b');
        System.out.println('a'-'b');
        System.out.println('a'*'b');
        System.out.println('a'/'b');
        System.out.println('a'%'b' + "\n");

        System.out.println("===== 문자와 정수의 연산 =====");
        System.out.println('a'+1);
        System.out.println('a'-1);
        System.out.println('a'*2);
        System.out.println('a'/2);
        System.out.println('a'%2 + '\n');

        System.out.println("===== 문자와 실수의 연산 =====");
        System.out.println('a'+1f);
        System.out.println('a'-1f);
        System.out.println('a'*2f);
        System.out.println('a'/2f);
        System.out.println('a'%2f + '\n');

        System.out.println("===== 문자열와 문자열의 연산 =====");
        System.out.println("hello" + "world" + '\n');
        /*
        System.out.println("hello" - "world");
        System.out.println("hello" * "world");
        System.out.println("hello" / "world");
        System.out.println("hello" % "world");  문자열끼리는 더하기 외의 연산을 할 수 없다.*/

        System.out.println("===== 문자열과 다른 형태의 값의 연산 =====");
        System.out.println("helloWorld" + 123);
        System.out.println("helloWorld" + 123.456);
        System.out.println("helloWorld" + 'a');
        System.out.println("helloWorld" + true);
        System.out.println("123" + "456");      //문자열과 다른 형태의 값을 더하면 문자형 리터럴로 취급된다.


        System.out.println("===== 논리값 연산 =====");
        //논리값은 내부적으로 숫자로 취급하긴 하지만 연산은 불가능하다. (단, 문자열과의 +연산은 가능하다)
        System.out.println("문자열+논리값" + true);
    }
}
