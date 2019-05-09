package com.a.mianshi.december.eighteen;

/**
 * 类描述
 *
 * @author Mr.Wu
 * @create 2018-12-17
 */
public class Num3 {

		String str = new String("good");
		char [] ch = {'a','b','c'};
		public void change(String str,char [] ww){
			str = "test ok";
			ww[0] = 'g';
		}

		public static void main(String[] args) {
			Num3 num3 = new Num3();
			num3.change(num3.str,num3.ch);
			System.out.println(num3.str+"and");
			System.out.println(num3.ch);
		}



	public void modify(){
//		// 引用必须在初始化时就赋值
		int i,j;
		int k = 1;
		i = 100;
		while(i>0){
			j = i*2;
			System.out.println("The value of j is" +j);
			k = k+1;
			i--;
		}
	}

}
