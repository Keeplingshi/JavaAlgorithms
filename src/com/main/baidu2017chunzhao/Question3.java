package com.main.baidu2017chunzhao;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 	三维空间中有N个点，每个点可能是三种颜色的其中之一，三种颜色分别是红绿蓝，分别用'R', 'G', 'B'表示。 
	现在要找出三个点，并组成一个三角形，使得这个三角形的面积最大。
	但是三角形必须满足：三个点的颜色要么全部相同，要么全部不同。 
	输入描述:
		首先输入一个正整数N三维坐标系内的点的个数.(N <= 50) 
		接下来N行，每一行输入 c x y z，c为'R', 'G', 'B' 的其中一个。x，y，z是该点的坐标。(坐标均是0到999之间的整数)
	
	输出描述:
		输出一个数表示最大的三角形面积，保留5位小数。
	
	输入例子1:
		5
		R 0 0 0
		R 0 4 0
		R 0 0 3
		G 92 14 7
		G 12 16 8
	
	输出例子1:
		6.00000
		
		
		
11
G 125 246 581
B 149 595 713
B 183 772 29
G 615 880 427
G 515 401 389
G 668 204 632
G 483 246 736
B 709 903 700
R 681 14 532
B 758 607 466
G 307 570 192

264828.68164

 * @author Administrator
 *
 */
public class Question3 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		String[] rgbs=new String[n];
		int[] x=new int[n];
		int[] y=new int[n];
		int[] z=new int[n];
		
		for(int i=0;i<n;i++)
		{
			rgbs[i]=sc.next();
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
			z[i]=sc.nextInt();
		}
		
		double max=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					//三个点不能是同一点
					if(i!=j&&i!=k&&j!=k)
					{
						//三个点同一个颜色或三个点都是不同颜色
						if((rgbs[i].equals(rgbs[j])&&rgbs[i].equals(rgbs[k])&&rgbs[j].equals(rgbs[k]))||
								((!rgbs[i].equals(rgbs[j]))&&(!rgbs[i].equals(rgbs[k]))&&(!rgbs[j].equals(rgbs[k]))))
						{
							
							long x1=x[j]-x[i];
							long y1=y[j]-y[i];
							long z1=z[j]-z[i];
							
							long x2=x[k]-x[i];
							long y2=y[k]-y[i];
							long z2=z[k]-z[i];
							
//							设a=(X1,Y1,Z1),b=(X2,Y2,Z2),
//							a×b=（Y1Z2-Y2Z1,Z1X2-Z2X1,X1Y2-X2Y1）
							long a=y1*z2-y2*z1;
							long b=z1*x2-z2*x1;
							long c=x1*y2-x2*y1;
							long tmp=a*a+b*b+c*c;
							
							double r=Math.sqrt(tmp);
							double s=r/2;
							
							max=max>s?max:s;
							
						}
					}
				}
			}
		}
		
		
		System.out.println(String.format("%.5f", max));
	}
	
}
