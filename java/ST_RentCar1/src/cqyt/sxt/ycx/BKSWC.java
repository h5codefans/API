package cqyt.sxt.ycx;

//��������GL8�γ�
public class BKSWC extends Car {

    public int CalcRent(int days) {
        System.out.println("��������GL8������"+days+"�죬���"+days*SinglePrice.BKSWC);
        return days*SinglePrice.BKSWC;
   }
}
