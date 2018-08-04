package com.main.pinduoduo2018chun2;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        //偏移量offset、元素数量n，列表L1的长度l1，列表L2的长度l2
//              20000          30000         20000           10000
        Scanner sc = new Scanner(System.in);
        int offset = sc.nextInt();
        int n = sc.nextInt();
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();

        int start1, end1, start2, end2 ;

        if (offset <= l1) {
            start1 = offset;
            end1 = offset + n <= l1 ? (offset + n) : l1;

            start2 = 0;
            end2 = offset + n > l1 + l2 ? l2 : (offset + n - l1);
            end2 = end2 > 0 ? end2 : 0;
        }else{
            start1 = l1;
            end1 = l1;

            start2 = offset - l1 > l2 ? l2 : offset - l1;
            end2 = offset + n > l1 + l2 ? l2 : (offset + n - l1);
        }

        System.out.println(start1+" "+end1+" "+start2+" "+end2);
    }

}
