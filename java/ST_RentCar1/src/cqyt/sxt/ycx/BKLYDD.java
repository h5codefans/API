package cqyt.sxt.ycx;

//����������γ�
public class BKLYDD extends Car{
    public int CalcRent(int days) {
        System.out.println("���������������"+days+"�죬���"+days*SinglePrice.BKLYDD);
        return days*SinglePrice.BKLYDD;
   }
}
