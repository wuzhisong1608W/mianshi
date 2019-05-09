package com.a.mianshi.december.twelve;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * 类描述
 *
 * @author Mr.Wu
 * @create 2018-12-11
 */
public class Num4 {
	public static void main(String[] args) {
		try {
			PrintWriter out = new PrintWriter(new FileOutputStream("d:/abc.txt"));
			String name = "123";
			out.print(name);
			out.flush();
		} catch (Exception e) {
			System.out.println("文件没有发现！");
		}

	}
}
