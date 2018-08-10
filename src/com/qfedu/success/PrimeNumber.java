package com.qfedu.success;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author Bingove
 * @Date 2018/8/10 0010 下午 18:38
 * 100之内的质数
 * 质数：除了能被1 以及本身相除
 */
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("请输入一个整数:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        List<Integer> prime = findPrime(number);
        System.out.println(prime);
    }

    //判断是否为质数
    public static boolean yesOrNoPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    //找出质数
    public static List<Integer> findPrime(int number) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= number;i++) {
            if(yesOrNoPrime(i)) {
                list.add(i);
            }
        }
        return list;
    }
}
