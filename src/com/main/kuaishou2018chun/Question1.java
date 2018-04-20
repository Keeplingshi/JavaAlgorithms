package com.main.kuaishou2018chun;

import java.math.BigInteger;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		BigInteger x=sc.nextBigInteger();
		BigInteger y=sc.nextBigInteger();
		BigInteger n=sc.nextBigInteger();
		
		BigInteger result=x.modPow(y, n);
		System.out.println(result);
	}

}
