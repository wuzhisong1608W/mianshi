package com.a.mianshi.jvms;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 类描述
 * 双亲委派
 * @author Mr.Wu
 * @create 2019-01-09
 */
public class Zhanghu {


//	@Autowird
//	private UserService userService;


	public static void main(String[] args) {
		// 类默认使用的是AppClassLoader
		ClassLoader c = Zhanghu.class.getClassLoader();
		System.out.println(c);
		ClassLoader c1 = c.getParent(); //获取c这个类加载器的父类加载器
		System.out.println(c1);
		ClassLoader c2 = c1.getParent();//获取c1这个类加载器的父类加载器
		System.out.println(c2);
		Zhanghu zhanghu = new Zhanghu();
		// 银行卡账号
//		String card_no ="1111";
		// 黑客的银行账号
//		String card_no ="1238590458333";
//		zhanghu.add();
//		zhanghu.getClass();
		String method_name = "";
//		int count = userService.getNameCount(method_name);
//		if (count>0){
//		Object
//		} else {

//		}
	}


}
