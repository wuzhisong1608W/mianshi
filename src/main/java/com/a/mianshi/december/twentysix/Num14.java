package com.a.mianshi.december.twentysix;

/**
 * 类描述
 *
 * @author Mr.Wu
 * @create 2018-12-26
 */
public class Num14 {
	public static void main(String[] args) throws Exception {
		Thread one = new Thread(){
			public void run(){
				System.out.println("A");
			}
		};

		Thread two = new Thread(){
			public void run(){
				System.out.println("B");
			}
		};

		Thread three = new Thread(){
			public void run(){
				System.out.println("C");
			}
		};

		one.start();
		one.join();
		two.start();
		two.join();
		three.start();

	}
}
