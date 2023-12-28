package com.teamName.section03.construct;

public class Application01
{
    public static void main(String[] args)
    {
        // 1. 상수선언 시 자료혀 앞에 final 키워드를 붙인다
        final int  AGE =20;
        //한번 초기화 한 이후 값을 재 대입하는 것은 불가능하다.

        //필요한 위치에 상수를 호출해서 사용한다.
        // 출력 구문에서 사용
        System.out.println("AGE의 값 : " + AGE);
        // 필요시 연산식에서 호출해서 사용
        System.out.println("AGE의 2배 : " + (AGE * 2));
    }}
