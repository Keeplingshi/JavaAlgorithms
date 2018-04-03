package com.main.pingduoduo2018chun;

import java.util.Scanner;

/**
 * 时针与分针
 * @author Administrator
 *
 */
public class Question2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String time=sc.nextLine();
		
		String[] times=time.split(":");
		int hour=Integer.parseInt(times[0]);
		int minute=Integer.parseInt(times[1]);
		
		if(hour>=12){
			hour-=12;
		}
		
		double radiusHour=hour*30+minute*0.5;		//时针的角度
		double radiusMinute=minute*6;
		
		double result=0.0;
		if(radiusHour>radiusMinute){
			result=radiusHour-radiusMinute;
		}else{
			result=radiusMinute-radiusHour;
		}
		
		if(result>=180){
			result=360-result;
		}
		
		if(result-(int)result>0){
			System.out.println(String.format("%.1f", result));
		}else{
			System.out.println((int)result);
		}
	}

}
