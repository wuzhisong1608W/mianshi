package com.a.mianshi.jvms;

public class SubClass extends Parent{
	// 静态变量
	public static String s_StaticField = "子类1--静态变量";
	// 变量
	public String s_Field = "子类2--变量";
	// 静态初始化块
	static {
		System.out.println(s_StaticField);
		System.out.println("子类3--静态初始化块");
	}
	// 初始化块
	{
		System.out.println(s_Field);
		System.out.println("子类4--初始化块");
	}
	// 无参构造器
	public SubClass(){
		System.out.println("子类5--无参构造器");
	}
	/**
	 * 主要考察:a.java静态方法和实例方法以及父子类初始化加载顺序
	 * 		  b.子类继承父类，无参构造的加载顺序
	 * 1、 当代码进入到子类的main方法时，此时不执行main()方法中的任何语句，
	 * 	     这时候会先开始按顺序先加载父类的static变量、static代码块，
	 *    再加载子类的static变量、static代码块；
	 * 2、 执行完println语句之后，此时new一个子类对象，由于子类继承父类，
	 *    此时会先按顺序初试化父类中的变量、
	 *    代码块、构造方法，然后再初始化子类变量、代码块、构造方法。
	 *    其中变量最先初始化创建，其次是代码块，构造方法最后创建
	 *  
	 */
	
	public static void main(String[] args) {
		System.out.println("main---begin");
		new SubClass();
		new SubClass();
		System.out.println("main---end");
	}

	public void add(){

	}
}
