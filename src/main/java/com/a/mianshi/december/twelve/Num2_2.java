package com.a.mianshi.december.twelve;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;

/**
 * 类描述
 *
 * @author Mr.Wu
 * @create 2018-12-11
 */
public class Num2_2 {
	public static void main(String[] args) {
		int j = 0;
		try {
			j = 1/0;
			return;
		} catch (Exception e){
			j = 1;
		} finally {
			j = 2;
		}
		System.out.println("end:"+j);
	}
}
