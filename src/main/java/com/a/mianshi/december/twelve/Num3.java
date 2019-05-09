package com.a.mianshi.december.twelve;

/**
 * 类描述
 *
 * @author Mr.Wu
 * @create 2018-12-11
 */
public class Num3 {

	public static String output="";
	public static void foo(int i){
		System.out.println("------");
		try {
			if (i == 1) {
				throw new Exception();
			}
			output += "1";
		} catch (Exception e){
			output += "2";
			return;
		} finally {
			output += "3";
		}
		output += "4";
	}
	public static void main(String[] args) {
		foo(0);
		foo(1);
		System.out.println(output);

	}

}
