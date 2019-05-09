package com.a.mianshi.jvms;

/**
 * 类描述
 *
 * @author Mr.Wu
 * @create 2019-01-08
 */
public class ClassLoaders {
	public static void main(String[] args) {
		ClassLoader c = ClassLoaders.class.getClassLoader();
		System.out.println(c);
		ClassLoader c1 = c.getParent();
		System.out.println(c1);
		ClassLoader c2 = c1.getParent();
		System.out.println(c2);
	}
}
