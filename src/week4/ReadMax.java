package week4;

/*Write a program that will read the marks of 3 students using the Scanner class and 
display the following:
(a)  average marks
(b)  maximum marks 
Hint:  x = Math.max(a,b); will cause x to be assigned the maximum of a and b
  y = Math.max (x, c); will cause y to be assigned the maximum of a, b and c
 Find other such methods in Math class using Java docs (ask lab-assistant)
 (c)  minimum marks：Similar to part b) but you need to use a different method
* */

import java.util.*;

public class ReadMax {

	int total = 3;
	double a = 30.99;
	double b = 45.77;
	double c = 90.77;
	double x = Math.max(a, b);
	double y = Math.max(a, c);
	double z = Math.min(a, b);
	double q = Math.min(a, c);

	public void average(double a, double b, double c) {

		double avg = (a + b + c) / total;
		System.out.println(" average marks is " + avg);
	}

	// max方法；
	public static double max(double x, double y) {
		double result1;
		if (x > y) {
			result1 = x;
		} else {
			result1 = y;
		}
		return result1;
	}

//min方法
	public static double min(double z, double q) {
		double result2;
		if (z < q) {
			result2 = z;
		} else {
			result2 = q;
		}
		return result2;
	}

	public static void main(String[] args) {
		
		double result3;
		double result4;
		
		double result3=ReadMax.max();
		double result4=ReadMax.min(); 

		System.out.println("maximum mark is " + result3);
		System.out.println("minimum marks is " + result4);
	}
}
