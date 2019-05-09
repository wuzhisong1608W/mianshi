package com.a.mianshi.december.twentysix;

/**
 * 类描述
 *
 * @author Mr.Wu
 * @create 2018-12-26
 */
public class Num16 {
	public static void main(String[] args) {
		System.out.println(getValue(2));
	}

	public static int getValue(int i){
		int result = 0 ;
		switch (i){
			case 1:
				result = result +1;
			case 2:
				result = result +i*3;
			case 3:
				result = result +i*4;
			case 4:
				result = result +i*4;
			case 5:
				result = result +i*4;
		}
		return  result;
	}
}
