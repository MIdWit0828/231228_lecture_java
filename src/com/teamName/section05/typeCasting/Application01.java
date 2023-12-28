package com.teamName.section05.typeCasting;

public class Application01
{
    public static void main(String[] args)
    {
        //자동형변환
        //더 큰 자료형으로 데이터를 옮겨도 문제없이 자동 형변환 처리 된다
        byte bnum =1;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;
        float fnum = lnum;  // 실수 자료형은 표현할수 있는 범위가 정수형보다 넓음
        double dnum = fnum; // 정수는 실수로 자동형변환 된다
        //실제 값을 저장하는 매커니즘을 가진 것과 달리 실수형은 지수부와 가수부를 따로 나눠서 작성하기 떄문에 바이트크기보다 더 많은 값을 저장 가능
        
        //연산시에도 자동으로 큰 폭 자료형에 맞춰서 계산한다.

        //문자형은 int로 자동형변환된다
        int charNum = 'a';

        //논리형은 형변환 규칙에서 제외된다. 어느 자료형이든 boolean을 형변환해서 담을 수 없다.

        
    }}
