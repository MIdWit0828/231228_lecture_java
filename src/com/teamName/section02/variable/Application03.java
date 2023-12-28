package com.teamName.section02.variable;
// 변수를 사용하는 목적
public class Application03
{
    public static void main(String[] args)
    {
        //값에 의미를 부여하기 위한 목적
        int salary = 100000;
        int bonus = 200000;
        System.out.println("보너스를 포함한 급여" + (salary + bonus));

        //한번 저장해둔 값을 재사용하기 위해서
        int point = 100;
        System.out.println("1번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");
        System.out.println("6번 고객에게 포인트를 " + point + "포인트 지급하였습니다.");

        //시간에 따라 변하는 값을 저장하고 사용할 수 있다.
        int sum = 0;
        sum = sum+10;
        System.out.println("sum에 10을 더하면 현재 sum의 값은? " + sum);
        sum += 10;
        System.out.println("sum에 10이 있었으니 10을 추가로 더하면? " + sum);
        sum += 10;
        System.out.println("sum에 20이 있었으니 추가로 10을 더 더하면? " + sum);
    }
}
