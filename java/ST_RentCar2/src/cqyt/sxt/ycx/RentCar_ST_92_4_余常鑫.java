package cqyt.sxt.ycx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


/**
 * �⳵����
 * @author Administrator
 *
 */
class SinglePrice {
	//��������GL8
	public static int BKSWC=600;
	//����550i
	public static int BM=500;
	//���������
	public static int BKLYDD=300;
	//�𱭡������ͳ�С��16��
	public static int XY=800;
	//�𱭡������ͳ�����16��
	public static int DY=1500;
}
//������������
abstract class MotoVehicle {

	protected String no;
	protected String brand;
	protected String color;
	//���
	protected String mileage;
	public abstract int CalcRent(int days);
}

//�γ���
class Car extends MotoVehicle {
	
	protected  String type;
	protected  Car car;
	public Car() {}
	
	public Car(String type){
		this.type=type;
	}
    public Car(Car car) {
		this.car = car;
	}

	@Override
  public int CalcRent(int days) {
		return car.CalcRent(days);
		
  }
}

//��������GL8�γ�
class BKSWC extends Car {
  public BKSWC() {}
  
  public BKSWC(String type){
	  super(type);
  }
  public int CalcRent(int days) {
      System.out.println(this.type+","+SinglePrice.BKSWC+"Ԫ/�죬����"+days+"�죬���"+days*SinglePrice.BKSWC+"Ԫ");
      return days*SinglePrice.BKSWC;
 }
}

//����550i�γ�
class BM extends Car{
  public BM() {}
  
  public BM(String type){
	  super(type);
  }
  public int CalcRent(int days) {
      System.out.println(this.type+","+SinglePrice.BM+"Ԫ/�죬����"+days+"�죬���:"+days*SinglePrice.BM+"Ԫ");
      return days*SinglePrice.BM;
 }
}

//����������γ�
class BKLYDD extends Car{
  public BKLYDD(){}
  
  public BKLYDD(String type){
	  super(type);
  }
  public int CalcRent(int days) {
      System.out.println(this.type+","+SinglePrice.BKLYDD+"Ԫ/�죬����"+days+"�죬���"+days*SinglePrice.BKLYDD+"Ԫ");
      return days*SinglePrice.BKLYDD;
 }
}

//�ͳ���
class Bus extends MotoVehicle{
    //�ͳ���λ�Ƿ���Ҫ����16��
	protected  boolean seatCount;
	protected String type;
	private Bus bus;
	public Bus() {}
	
	public Bus(Bus bus) {
		this.bus = bus;
	}    
  
	
	public Bus(boolean seatCount,String type) {
		this.seatCount = seatCount;
		this.type=type;
	}

	@Override
	public  int CalcRent(int days) {
		return bus.CalcRent(days);
	}
}

//�𱭿ͳ�
class JB extends Bus{
	public JB(){}
	
    public JB(boolean seatCount,String type){
    	super(seatCount,type);
    }
	public  int CalcRent(int days) {
	       if(!this.seatCount){
	    	   System.out.println(this.type+"С��16����"+SinglePrice.XY+"Ԫ/�죬����"+days+"�죬���:"+ SinglePrice.XY*days);
	    	   return SinglePrice.XY*days;
	       }else{
	    	   System.out.println(this.type+"����16����"+SinglePrice.DY+"Ԫ/�죬����"+days+"�죬���:"+ SinglePrice.DY*days);
	    	   return SinglePrice.DY*days;
	       }
			
		}
}

//��������
class JL extends Bus{
	public JL(){}
	
	public JL(boolean seatCount,String type){
		super(seatCount,type);
	}
	public  int CalcRent(int days) {
	       if(!this.seatCount){
	    	   System.out.println(this.type+"С��16����"+SinglePrice.XY+"Ԫ/�죬����"+days+"�죬���:"+ SinglePrice.XY*days);
	    	   return SinglePrice.XY*days;
	       }else{
	    	   System.out.println(this.type+"����16����"+SinglePrice.DY+"Ԫ/�죬����"+days+"�죬���:"+ SinglePrice.DY*days);
	    	   return SinglePrice.DY*days;
	       }
			
		}
}
/**
 * �ೣ��
 * @author Administrator
 *
 */
public class RentCar_ST_92_4_�ೣ�� {
   public static void rentCar(List<Integer> list){
	   System.out.print("�������⳵������");
	   Scanner s=new Scanner(System.in);
       int days=s.nextInt();
	   while(true){
		   System.out.print("�������⳵���ͣ�"+"1"+"��ʾ�γ���"+2+"��ʾ�ͳ�:");
		   int type=s.nextInt();
		   if(type==1){
               car(days,list);
               break;
		   }else if(type==2){
               bus(days,list);
               break;
		   }
	   }

	   System.out.println("#########################################");
   }
   public static void car(int days,List<Integer> list){ 
	  System.out.print("�������⳵����,"+1+",��ʾ��������GL8��"+2+"��ʾ����550i��"+3+"��ʾ�����������");
	  Scanner s1=new Scanner(System.in);
	  int num = s1.nextInt();
 	  switch(num){
	      case 1:
		       Car c=new Car(new BKSWC("��������GL8"));
		       list.add(c.CalcRent(days));
		       break;
	      case 2:
		       Car c1=new Car(new BM("����550i"));
		       list.add(c1.CalcRent(days));
		       break;
	      case 3:
		       Car c2=new Car(new BKLYDD("���������"));
		       list.add(c2.CalcRent(days));
		       break;
		 default:
			 car(days,list);
			 break;
	    	  
	   }

  }
	  public static void bus(int days,List<Integer> list){
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
		       Bus c4=new Bus(new JB(flag,"�𱭿ͳ�"));
		       list.add(c4.CalcRent(days));
		       break;
	       case 2:
		       Bus c5=new Bus(new JL(flag,"�����ͳ�"));
		       list.add(c5.CalcRent(days));
			   break;
		  default:
			   bus(days,list);
			   break;
		   
	   }
  }
	public static void main(String[] args) {
	      List<Integer> list=new ArrayList<Integer>();
	      int fee,sumFee=0;
	      //�⳵
          rentCar(list);
          rentCar(list);
         //�⳵�ܷ���
  	    for(Iterator iter2=list.iterator();iter2.hasNext();){
	    	fee=(Integer) iter2.next();
            sumFee+=fee;
	    }
        System.out.println("�⳵�ܷ���Ϊ��"+sumFee+"Ԫ");
   }
}
