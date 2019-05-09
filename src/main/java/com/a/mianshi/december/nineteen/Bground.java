package com.a.mianshi.december.nineteen;

/**
 * 类描述
 *
 * @author Mr.Wu
 * @create 2018-12-19
 */
public class Bground extends Thread {

	public static void main(String argv[]){
		Bground b = new Bground();
		b.run();
	}

	public void start(){
		for (int i = 0; i <10; i++){
			System.out.println("Value of i = " + i);
		}
	}
}
