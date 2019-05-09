package com.a.mianshi.december.twentysix;

/**
 * 类描述
 *
 * @author Mr.Wu
 * @create 2018-12-26
 */
public class Num7 {

	static boolean foo(char c){
		System.out.println(c);
		return  true;
	}

	public static void main(String[] args) {
		int i = 0 ;
		for (foo('A');foo('B')&&(i<2);foo('C')){
			i++;
			foo('D');
		}
	}

}
