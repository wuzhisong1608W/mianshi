package com.a.mianshi.december.twelve;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 类描述
 *
 * @author Mr.Wu
 * @create 2018-12-11
 */
public class Num3_2 {
	public static void main(String[] args) {
		try {
			// 动态加载Student类
			Class c = Class.forName("Student");
			// getDeclaredMethods(),该方法是获取本类中的所有方法，包括私有的(private、protected、默认以及public)的方法。
			// getMethods(),该方法是获取本类以及父类或者父接口中所有的公共方法(public修饰符修饰的)
			Method m[] = c.getDeclaredMethods();
			for (Method method :m){
				System.out.println(method.getName().toString());
			}
			Field f[] = c.getDeclaredFields();
		}catch (Exception e){

		}finally {

		}
	}
}
