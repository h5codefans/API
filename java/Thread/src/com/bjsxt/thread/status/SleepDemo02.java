package com.bjsxt.thread.status;


/**
 * sleep:模拟网络延时
 * @author Administrator
 *
 */
public class SleepDemo02 {
    public static void main(String[] args){
		   //真实角色
		   Web12306 web=new Web12306();
		   //代理角色
		   Thread t1=new Thread(web,"路人甲");
		   Thread t2=new Thread(web,"路人乙");
		   Thread t3=new Thread(web,"工程师");
		   
		   //开启线程
		   t1.start();
		   t2.start();
		   t3.start();
    }
}
class Web12306 implements Runnable {
	   private int num=50;
	   
	   @Override
		public void run() {
			while(true){
				if(num<=0){
					break;
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"抢到了"+num--);
			}
		}
	}