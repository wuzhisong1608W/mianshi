package com.a.mianshi.december.twentyfive;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.WeakHashMap;

/**
 * 类描述
 *
 * @author Mr.Wu
 * @create 2018-12-25
 */
public class Num2 {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "he" +new String("llo");
		String str3 = str1;
		String str4 = "he"+"llo";
		System.out.println(str1 == str2); //  false
		System.out.println(str1 == str4); // true
		System.out.println(str1.equals(str2)); //  true
		System.out.println(str1 == str3); //  true
		System.out.println(str1.equals(str3)); //  true
	}
}
