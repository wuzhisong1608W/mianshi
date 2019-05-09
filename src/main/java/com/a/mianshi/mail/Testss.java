package com.a.mianshi.mail;

/**
 * 类描述
 *
 * @author Mr.Wu
 * @create 2019-01-07
 */
public class Testss {

	public static CanReliveObj obj;

	public static void main(String[] args) throws
			InterruptedException{

		obj=null;   //可复活
		System.gc();
		Thread.sleep(1000);
		if(obj==null){
			System.out.println("obj 是 null");
		}else{
			System.out.println("obj 可用");
		}
		System.out.println("第二次gc");
		obj=null;    //不可复活
		System.gc();
		Thread.sleep(1000);
		if(obj==null){
			System.out.println("obj 是 null");
		}else{
			System.out.println("obj 可用");
		}
	}
}
