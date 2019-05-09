package com.a.mianshi.jvms;

public class Parent {
	// 静态变量
	public static String p_StaticField = "父类1--静态变量";
	// 变量
	public String p_Field = "父类2--变量";
	
	// 静态初始化块
	static {
		System.out.println(p_StaticField);
		System.out.println("父类3--静态初始化块");
	}
	 // 初始化块
	{
		System.out.println(p_Field);
		System.out.println("父类4--初始化块");
	}
	// 无参构造器
	public Parent(){
		System.out.println("父类5--无参构造器");
	}
}
