package cqyt.sxt.ycx;


//������������
abstract class MotoVehicle {

	protected String no;
	protected String brand;
	protected String color;
	//���
	protected String mileage;
    public MotoVehicle() {
	}
	public MotoVehicle(String no) {
		this.no = no;
	}

	public abstract int CalcRent(int days);
}
