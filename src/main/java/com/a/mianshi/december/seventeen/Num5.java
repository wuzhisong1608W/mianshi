package com.a.mianshi.december.seventeen;

import javax.sound.sampled.Line;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 类描述
 * 小数计算
 *
 * @author Mr.Wu
 * @create 2018-12-17
 */
public class Num5 {

	public static void main(String[] args) {
//		double a = 1.1;
//		double b = 0.9;
//		System.out.println(a-b);
//		BigDecimal a1 = new BigDecimal(a);
//		BigDecimal b1 = new BigDecimal(b);
		BigDecimal d = new BigDecimal(100000);      //存款
		BigDecimal r = new BigDecimal(0.001875*3);   //利息
//		System.out.println("BigDecimal加法："+d.add(r));
//		System.out.println("BigDecimal减法"+d.subtract(r));
		System.out.println("BigDecimal乘法"+d.multiply(r).setScale(3,RoundingMode.HALF_UP));
		System.out.println("BigDecimal除法"+d.divide(r,2,RoundingMode.HALF_UP));
//		LinkedList


//		BigDecimal d = new BigDecimal(100000);      //存款
//		BigDecimal r = new BigDecimal(0.001875*3);   //利息
//		BigDecimal i = d.multiply(r).setScale(2,RoundingMode.HALF_EVEN);     //使用银行家算法
//		BigDecimal f = d.divide(r).setScale(2,RoundingMode.HALF_UP);
//		BigDecimal e = d.divide(r,2,RoundingMode.HALF_UP);     //使用银行家算法
//		System.out.println("季利息是："+i);
//		System.out.println("季利息是："+e);
//		System.out.println("季利息是："+f);

//		BigDecimal i = new BigDecimal(1);      //存款
//		BigDecimal j = new BigDecimal(3);   //利息
//		System.out.println(i.divide(j,2,RoundingMode.HALF_UP));

	}

}
