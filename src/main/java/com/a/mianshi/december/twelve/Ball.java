package com.a.mianshi.december.twelve;

/**
 * 类描述
 *
 * @author Mr.Wu
 * @create 2018-12-11
 */
public class Ball implements Rollable {
	private String name;
	public String getName(){
		return  name;
	}

	public  Ball(String name){
		this.name = name;
	}
	@Override
	public void play() {
		Ball ball  = new Ball("FootBall");
		System.out.println(ball.getName());
	}
}
