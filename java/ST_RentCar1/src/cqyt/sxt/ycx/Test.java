package cqyt.sxt.ycx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/**
 * �ೣ��
 * @author Administrator
 *
 */
public class Test {
   public static void main(String[] args) {
	      List list=new ArrayList();
	      int fee,sumFee=0;
          rentCar(list);
          rentCar(list);
  	    for(Iterator iter2=list.iterator();iter2.hasNext();){
	    	fee=(Integer) iter2.next();
            sumFee+=fee;
	    }
        System.out.println("�⳵�ܷ���Ϊ��"+sumFee);
   }
   public static void rentCar(List list){
	   System.out.print("�������⳵������");
	   Scanner s=new Scanner(System.in);
       int days=s.nextInt();
	   while(true){
		   System.out.print("�������⳵���ͣ�"+"1"+"��ʾ�γ���"+2+"��ʾ�ͳ�:");
		   int type=s.nextInt();
		   if(type==1){
               car1(days,list);
               break;
		   }else if(type==2){
               car2(days,list);
               break;
		   }
	   }
   }
   public static void car1(int days,List list){ 
	  System.out.print("�������⳵����,"+1+",��ʾ��������GL8��"+2+"��ʾ����550i��"+3+"��ʾ�����������");
	  Scanner s1=new Scanner(System.in);
	  int num = s1.nextInt();
 	  switch(num){
	      case 1:
		       Car c=new Car(new BKSWC());
		       list.add(c.CalcRent(days));
		       break;
	      case 2:
		       Car c1=new Car(new BM());
		       list.add(c1.CalcRent(days));
		       break;
	      case 3:
		       Car c2=new Car(new BKLYDD());
		       list.add(c2.CalcRent(days));
		       break;
		 default:
			 car1(days,list);
			 break;
	    	  
	   }

  }
	  public static void car2(int days,List list){
		   boolean flag=false;
		   System.out.print("�������⳵���ͣ�"+"1"+"��ʾ�𱭿ͳ���"+2+"��ʾ�����ͳ�:");
		   Scanner s2=new Scanner(System.in);
		   int num1 = s2.nextInt();
		   if(num1==1||num1==2){
			   System.out.print("�Ƿ���Ҫ����16���Ŀͳ���ѡ��1��ʾ��Ҫ��");
			   Scanner s1=new Scanner(System.in);
			   int num2=s1.nextInt();
			   if(num2==1){
				   flag=true;
			   }
		   }
		   switch(num1){
	       case 1:
		       Bus c4=new Bus(new JB());
		       Bus p=new Bus(flag);
		       list.add(c4.CalcRent(days));
		       break;
	       case 2:
		       Bus c5=new Bus(new JL());
		       Bus p1=new Bus(flag);
		       list.add(c5.CalcRent(days));
			   break;
		  default:
			   car2(days,list);
			   break;
		   
	   }
  }
}


