package cqyt.sxt.ycx;

import java.util.Scanner;
/**
 * �ೣ��
 * @author Administrator
 *
 */
public class Test {
   public static void main(String[] args) {
       
          rentCar();
          rentCar();
   }
   public static void rentCar(){
	   System.out.print("�������⳵������");
	   Scanner s=new Scanner(System.in);
       int days=s.nextInt();
	   while(true){
		   System.out.print("�������⳵���ͣ�"+"1"+"��ʾ�γ���"+2+"��ʾ�ͳ�:");
		   int type=s.nextInt();
		   if(type==1){
               car1(days);
               break;
		   }else if(type==2){
               car2(days);
               break;
		   }
	   }
   }
   public static void car1(int days){ 
	  System.out.print("�������⳵����,"+1+",��ʾ��������GL8��"+2+"��ʾ����550i��"+3+"��ʾ�����������");
	  Scanner s1=new Scanner(System.in);
	  int num = s1.nextInt();
 	  switch(num){
	      case 1:
		       Car c=new Car(new BKSWC());
		       c.CalcRent(days);
		       break;
	      case 2:
		       Car c1=new Car(new BM());
		       c1.CalcRent(days);
		       break;
	      case 3:
		       Car c2=new Car(new BKLYDD());
		       c2.CalcRent(days);
		       break;
		 default:
			 car1(days);
			 break;
	    	  
	   }

  }
	  public static void car2(int days){
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
		       Bus d=new Bus(new JB());
		       Bus p=new Bus(flag);
		       d.CalcRent(days);  
		       break;
	       case 2:
		       Bus d1=new Bus(new JL());
		       Bus p1=new Bus(flag);
		       d1.CalcRent(days);
			   break;
		  default:
			   car2(days);
			   break;
		   
	   }
  }
}


