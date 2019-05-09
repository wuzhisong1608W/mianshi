package com.a.mianshi.distributed.lock;

/**
 *  即有synchronized关键字修饰的语句块。
 *     被该关键字修饰的语句块会自动被加上内置锁，从而实现同步
 *     代码如：
 *     synchronized(object){
 *     }
 *      注：同步是一种高开销的操作，因此应该尽量减少同步的内容。
 *     通常没有必要同步整个方法，使用synchronized代码块同步关键代码即可。
 */
public class Num2_6_synchronized_code {
	private int count =0;//账户余额
    //存钱
    public  void addMoney(int money){
    	synchronized (this) {
            count +=money;
        }
        System.out.println(System.currentTimeMillis()+"存进："+money);
    }
    //取钱
    public  void subMoney(int money){
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
