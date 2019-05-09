package com.a.mianshi.distributed.lock;

import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 类描述
 * 定时循环执行类
 *
 * @author Mr.Wu
 * @create 2018-12-25
 */
public class TimerTest {
//	@Transactional
//	public static void main(String[] args) {
//		Timer timer = new Timer();
//		// 我们自己的业务逻辑代码
//		String name = "张虎";
//		String method_name = "addMoney";
//		double money =100;
//		// 判断数据表中是否存在 method_name=“addMoney”的记录
//		// SELECT COUNT(*) FROM method_lock m WHERE m.method_name='addMoney' and m.update_name = '张虎'
//		int count = payService.getMethodCount(method_name,name,new Date());
//		if (count > 0){
//			// 数据库中存在addMoney记录，等待锁释放
//			timer.schedule(new TimerTask() {
//				@Override
//				public void run() {
//					System.out.println("你啥时候释放锁啊");
//				}
//			},1000,1000);
//			if (count == 1){
//				// 调用addMoney方法，进行用户余额更新
//				orderService.addMoney(money);
//				// 删除数据库中的数据，释放锁
//				payService.deleteMethodLock(method_name);
//			} else {
//
//			}
//		} else {
//			// count = 0
//			// 数据库中不存在addMoney记录，添加一条method_name='addMoney'记录。加锁
//			payService.addMethodLock(method_name);
//			// 调用addMoney方法，进行用户余额更新
//			orderService.addMoney(money);
//			// 删除数据库中的数据，释放锁
//			payService.deleteMethodLock(method_name);
//		}
//	}
}
