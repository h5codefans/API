package cqyt.sxt.ycx;

//�γ���
public class Car extends MotoVehicle {
	
	private String type;
	private Car car;
	public Car() {

	}
	
    public Car(Car car) {
		this.car = car;
	}

	public Car(String no,String type) {
		super(no);
		this.type = type;

	}

	@Override
    public int CalcRent(int days) {
		return car.CalcRent(days);
		
    }
}
