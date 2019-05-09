package com.a.mianshi.distributed.lock;

/**
 * a.volatile关键字为域变量的访问提供了一种免锁机制，
 * b.使用volatile修饰域相当于告诉虚拟机该域可能会被其他线程更新，
 * c.因此每次使用该域就要重新计算，而不是使用寄存器中的值
 * d.volatile不会提供任何原子操作，它也不能用来修饰final类型的变量
 */
public class Num2_6_synchronized_volatile {
	private volatile int count =0;//账户余额
    //存钱
    public  void addMoney(int money){
        synchronized (this) {
            count +=money;
        }
        System.out.println(System.currentTimeMillis()+"存进："+money);
    }
    //取钱
    public   void subMoney(int money){
        synchronized (this) {
            if(count-money < 0){
                System.out.println("余额不足");
                return;
            }
            count -=money;
        }
        System.out.println(+System.currentTimeMillis()+"取出："+money);
    }
    //查询
    public void lookMoney(){
        System.out.println("账户余额："+count);
    }
}
