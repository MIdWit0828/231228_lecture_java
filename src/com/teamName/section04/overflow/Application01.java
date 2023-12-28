package com.teamName.section04.overflow;

public class Application01
{
    public static void main(String[] args)
    {
        System.out.println("변수형의 최대 최소값을 알수 있는 메소드" + Byte.MIN_VALUE + Byte.MAX_VALUE );
        //오버플로우 시에는 발생한 carry를 버림처리하고 sign bit를 반전시켜 최소값으로 순환시킨다.

        // 오버플로우
        byte num1 = 127;
        System.out.println(num1);
        num1++;
        System.out.println(num1);

        // 언더플로우
        num1--;
        System.out.println(num1);

        // 오버플로우나 언더플로우는 컴파일 에러를 발생시키지 않으므로
        // 최대값, 최소값 범위를 고려하여 변수의 자료형을 사용하여 사용해야 한다

        int firstNum = 1000000; //100만
        int secondNum = 700000; // 70만

        int sum = firstNum * secondNum; //7천억 예상
        System.out.println(sum);

        long lSum = firstNum * secondNum; // int + int의 연산이 먼저 일어났으므로 오버플로우가 일어남
        System.out.println(lSum);

        lSum = (long) firstNum * (long) secondNum;
        System.out.println(lSum);


    }}
