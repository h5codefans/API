package cn.bjsxt.test;

import java.util.Date;

/**
 * 测试Date的用法
 * @author Administrator
 *
 */
public class TestDate {
     public static void main(String[] args){
    	Date d=new Date();
    	long t=System.currentTimeMillis();
    	System.out.println(t);
    	
    	Date d2=new Date(1000);
    	System.out.println(d2.toGMTString()); //不建议使用
    	d2.setTime(20000);
    	System.out.println(d2.getTime());
    	System.out.println(d.getTime()<d2.getTime());
    	
     }
}
