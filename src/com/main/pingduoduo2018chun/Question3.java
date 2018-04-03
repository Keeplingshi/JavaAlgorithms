package com.main.pingduoduo2018chun;

import java.util.Scanner;

/**
 * 数三角形
 * 
4
0 0
0 1
1 0
1 1
 * @author Administrator
 *
 */
public class Question3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		Point points[]=new Point[n];
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			points[i]=new Point(x, y);
		}
		
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					boolean flag=IsTriangle(points[i],points[j],points[k]);
					if(flag){
						count++;
					}
					
				}
			}
		}
		
		System.out.println(count);
	}

	/**
	 * 判断6个点，是否为一个三角形
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param x3
	 * @param y3
	 * @return
	 */
	private static boolean IsTriangle(Point point1,Point point2,Point point3)
	{
        //得到3条直线  
        Line line1 = new Line(point1,point2);  
        Line line2 = new Line(point1,point3);  
        Line line3 = new Line(point2,point3);  
        //存储三条直线的长度  
        double a = line1.getLineLen();  
        double b = line2.getLineLen();  
        double c = line3.getLineLen(); 
        
		if(line1.isParallel(line2)||line1.isParallel(line3)||line2.isParallel(line3))  
        {  
            return false; 
        }
        if((a+b)<c||(a+c)<b||(b+c)<a||Math.abs(a-b)>c||Math.abs(a-c)>b||Math.abs(b-c)>a)  
        {  
        	return false; 
        }
		return true;
	}
	
}

//点  
class Point{  
    //x坐标  
    private double x;  
    //y坐标  
    private double y;  
      
    public Point(double x, double y)  
    {  
        this.x=x;  
        this.y=y;  
    }  
  
    public double getX() {  
        return x;  
    }  
  
    public void setX(double x) {  
        this.x = x;  
    }  
  
    public double getY() {  
        return y;  
    }  
  
    public void setY(double y) {  
        this.y = y;  
    }  
}
  
class Line  
{
    private double k;  		//斜率 
    private double lineLen; //直线长度
      
    public Line(Point point1 , Point point2)  
    {  
        this.k=(point1.getY()-point2.getY())/(point1.getX()-point2.getX());  
        this.lineLen=Math.sqrt(Math.pow(Math.abs(point1.getY()-point2.getY()), 2)+Math.pow(Math.abs(point1.getX()-point2.getX()), 2));  
    }  
      
    public double getK() {  
        return k;  
    }  
      
    public boolean isParallel(Line line)  
    {  
        if(this.k==line.getK())  
            return true;  
        return false;  
    }  
  
    public double getLineLen() {  
        return lineLen;  
    }
} 
