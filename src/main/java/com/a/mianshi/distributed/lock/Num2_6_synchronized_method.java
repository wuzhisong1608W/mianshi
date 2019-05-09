package com.a.mianshi.distributed.lock;

/**
 * 同步方法 
    即有synchronized关键字修饰的方法。 
    由于java的每个对象都有一个内置锁，当用此关键字修饰方法时， 
    内置锁会保护整个方法。在调用该方法前，需要获得内置锁，否则就处于阻塞状态。
 * @author 37647
 *
 */
public class Num2_6_synchronized_method {
	private int count =0;//账户余额
    
    //存钱
    public synchronized void addMoney(int money){
        count +=money;
        System.out.println(System.currentTimeMillis()+"存进："+money);
    }
    
    //取钱
    public  synchronized void subMoney(int money){
        if(count-money < 0){
            System.out.println("余额不足");
            return;
        }
        count -=money;
        System.out.println(+System.currentTimeMillis()+"取出："+money);
    }
    
    //查询
    public void lookMoney(){
        System.out.println("账户余额："+count);
    }
	
	
}
