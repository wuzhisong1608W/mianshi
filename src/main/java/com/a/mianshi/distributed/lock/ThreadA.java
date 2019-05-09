package com.a.mianshi.distributed.lock;

/**
 * 类描述
 *
 * @author Mr.Wu
 * @create 2018-12-25
 */
public class ThreadA extends Thread {
	private LockService service;

	public ThreadA(LockService service) {
		this.service = service;
	}

	@Override
	public void run() {
		service.seckill();
	}
}

