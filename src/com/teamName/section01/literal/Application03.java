package com.teamName.section01.literal;
//연산관련 추가 예제
// 문자열 합치기 결과를 예측하고 사용할 수 있다.
public class Application03
{
    public static void main(String[] args)
    {
        // 두개의 값 이어붙이기
        System.out.println(9 + 9);
        System.out.println("9" + 9);
        System.out.println(9 + "9");
        System.out.println("9" + "9");

        //세개의 값 이어붙이기
        System.out.println(9 + 9 + "9"); //189
        System.out.println(9 + "9" + 9); //999
        System.out.println("9" + 9 + 9); //999
        System.out.println("9" + (9 + 9)); // 918
        
        //문자열 이어붙이기 응용
        System.out.println("===== 10과 20의 사칙연산 결과 =====");
        System.out.println((10+20));
        System.out.println((10-20));
        System.out.println((10*20));
        System.out.println((10/20));
        System.out.println((10%20)+'\n');

        System.out.println("===== 10과 20의 사칙연산 결과 보기 좋게 출력 =====");
        System.out.println("10과 20의 합 : " + (10+20));
        System.out.println("10과 20의 차 : " + (10-20));
        System.out.println("10과 20의 곱 : " + (10*20));
        System.out.println("10과 20의 나누기 한 몫 : " + (10/20));
        System.out.println("10과 20의 나누기 한 나머지 : " + (10%20));
    }
}
