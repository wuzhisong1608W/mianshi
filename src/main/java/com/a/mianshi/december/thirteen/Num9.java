package com.a.mianshi.december.thirteen;

/**
 * 类描述
 * 自定义异常
 *
 * @author Mr.Wu
 * @create 2018-12-12
 */
public class Num9 extends Exception{

	public void test1() throws CustomException{
		throw new CustomException("我喝酒了");
	}


}
