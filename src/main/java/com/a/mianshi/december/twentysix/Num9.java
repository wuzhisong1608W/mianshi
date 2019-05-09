package com.a.mianshi.december.twentysix;

import org.apache.logging.log4j.util.Strings;

/**
 * 类描述
 *
 * @author Mr.Wu
 * @create 2018-12-26
 */
public class Num9 {

	public static void main(String[] args) {
		Thread t = new Thread(){
			public void run(){
				pong();
			}
		};
//		t.run();
//		System.out.println("ping");
		String s = "sss";
		System.out.println(Integer.MAX_VALUE*2);
		System.out.println(Integer.MIN_VALUE*2);
		long x = Long.MAX_VALUE;
		for (int i = 2; i < 8; i++) {
			System.out.println("i的值为："+i+"。获取到的运算结果："+(int)(x * i));
		}
	}

	static void pong(){
		System.out.println("pong");
	}

}
