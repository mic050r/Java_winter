package inheritance.test1;

public class EV6 extends KIA {
	int chargeBattery;
	String softwareModel;
	
	public EV6() {
		//super(); //이게 원래 생략되어 있음
		System.out.println("EV6() 생성자 호출됨");
	}
	public void driveAutonomusly() {
		System.out.println("EV6가 자율주행을 하다.");
	}
	
	@Override
	public void stop() {
		System.out.println("Ev6가 멈추다.");
	}
	//turn + ctrl + space
	@Override
	public void turn(String direction) {
		System.out.println("EV6가 " + direction + "하다");
	}
}
