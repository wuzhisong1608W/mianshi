package com.a.mianshi.december.fourteen;

import java.util.ArrayList;
import java.util.List;

/**
 * 类描述
 *
 * @author Mr.Wu
 * @create 2018-12-14
 */
public class Num5 {
	public static void main(String[] args) {
		// 定义一个ArrayList(
		List A = new ArrayList();
		/*
			给List添加值，
			abcd
			测试用
		 */
		A.add("a");
		A.add("b");
		A.add("c");
		A.add("d");
		System.out.println("beforeA:"+A.size()); // 4
		List B = A.subList(0,A.size());
		System.out.println("beforeB:"+B.size());
		B.add("e");
		A.add("f");
		System.out.println("afterB:"+B.size());
		System.out.println("afterA:"+A.size());
	}
}
