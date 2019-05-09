package com.a.mianshi.december.twentysix;

/**
 * 类描述
 *
 * @author Mr.Wu
 * @create 2018-12-26
 */
public class Num28 {
	public static void main(String[] args) {
		String str1 = "232.tee";
		String[] aa = "aaa.bbb.ccc".split("\\.");
		for (int i = 0 ; i <aa.length ; i++ ) {

			System.out.println("--"+aa[i]);

		}
		System.out.println(str1.indexOf("."));
	}
}
