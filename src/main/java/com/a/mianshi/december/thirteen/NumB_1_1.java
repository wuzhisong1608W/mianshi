package com.a.mianshi.december.thirteen;

/**
 * 类描述
 *
 * @author Mr.Wu
 * @create 2018-12-12
 */
public class NumB_1_1 {
	public int add(int a,int b){
		try{
			System.out.println("try语句块");
			return  a+b;
		}catch (Exception e){
			System.out.println("catch语句块");

		}finally {
			System.out.println("finally语句块");

		}
		return  0;
	}

	public static void main(String[] args) {
		NumB_1_1 demo = new NumB_1_1();
		System.out.println("和是："+demo.add(9,34));
	}
}
