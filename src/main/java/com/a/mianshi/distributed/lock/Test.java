package com.a.mianshi.distributed.lock;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 类描述
 * redis分布式锁测试类
 *
 * @author Mr.Wu
 * @create 2018-12-25
 */

public class Test {
	public static void main(String[] args) {
		LockService service = new LockService();
		for (int i = 0; i < 50; i++) {
			ThreadA threadA = new ThreadA(service);
			threadA.start();
		}

	}
}