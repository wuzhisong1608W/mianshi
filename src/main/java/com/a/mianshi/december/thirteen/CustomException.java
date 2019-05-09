package com.a.mianshi.december.thirteen;

/**
 * 类描述
 * 自定义异常类
 *
 * @author Mr.Wu
 * @create 2018-12-12
 */
public class CustomException extends Exception {
	//无参构造方法
	public CustomException(){

		super();
	}

	//有参的构造方法
	public CustomException(String message){
		super(message);

	}

	// 用指定的详细信息和原因构造一个新的异常
	public CustomException(String message, Throwable cause){

		super(message,cause);
	}

	//用指定原因构造一个新的异常
	public CustomException(Throwable cause) {

		super(cause);
	}
}
