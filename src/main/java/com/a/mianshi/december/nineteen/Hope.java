package com.a.mianshi.december.nineteen;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 类描述
 *
 * @author Mr.Wu
 * @create 2018-12-19
 */
public class Hope {
	public static void main(String argv[]){
//		Hope h = new Hope();
		String a="My field1";
		String b="My field1";
		String c=new String("My field1");
		String d=new String("My field1");
		System.out.println(a == b);
		System.out.println(a==c);
		System.out.println(c==d);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(c.equals(d));
		try {
			String sss = "123";
			Integer.parseInt(sss);
		} catch (Exception e) {
			throw new IllegalArgumentException();
		} finally {

		}
	}


	// 构造函数
//	protected Hope(){
//		for(int i =0; i <10; i ++){
//			System.out.println(i);
//		}
//	}
}
