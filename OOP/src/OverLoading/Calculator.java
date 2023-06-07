package OverLoading;

public class Calculator {
	int add(int a,int b)
	{
		 return a+b;
	}
	
	int add(int x,int y,int z)
	{
		return x+y+z;
	}
	float add(int a , float b)
	{
		return a+b;
	}
	float add(float a, int b)
	{
		return a+b;
	}
	
	double add(double x,int y)
	{
		return x+y;
	}
	int add(int a,int b,int c,int d)
	{
		return a+b+c+d;
	}
	/*
	 Error
	String add(double q,int w)
	{
		return " " ;
	}*/
}
