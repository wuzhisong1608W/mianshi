package com.a.mianshi.integers;

public class Sub extends Super {

	public static void main(String[] args) {
		try{
			sss();
			System.out.println("A");
		}catch(RuntimeException e){
			System.out.println("B");
		}catch(Exception e){
			System.out.println("C");
		}finally {
			System.out.println("D");
		}
		System.out.println("E");
	}
	public static void sss(){
		throw new RuntimeException();
	}
}
