package cqyt.sxt.ycx;

//��������
public class JL extends Bus{
	public  void CalcRent(int days) {
	       if(!Bus.flag){
	    	   System.out.println("�𱭿ͳ�С��16��������"+days+"�죬���:"+ SinglePrice.XY*days);
	       }else{
	    	   System.out.println("�𱭿ͳ�����16��������"+days+"�죬���:"+ SinglePrice.DY*days);
	       }
			
		}
}
