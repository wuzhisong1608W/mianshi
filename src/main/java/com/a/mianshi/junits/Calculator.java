package com.a.mianshi.junits;

/**
 * 类描述
 *Junit测试类，实现加减乘除、平方、开方的计算器类
 * @author Mr.Wu
 * @create 2019-01-14
 */
public class Calculator {
	private static int result; // 静态变量，用于存储运行结果
	public int add(int n) {
	 	return 	result = result + n;
	}
	public int substract(int n) {
		 return result = result - 1;  //Bug: 正确的应该是 result =result-n
	}
	public void multiply(int n) {
	}         // 此方法尚未写好
	public void divide(int n) {
		result = result / n;
	}
	public void square(int n) {
		result = n * n;
	}
	public void squareRoot(int n) {
		int i  = 1/0;
	}
	public void clear() {     // 将结果清零
		result = 0;
	}
	public int getResult(){
		return result;
	}
}
