package week3.day1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposit amount in bank");
	}

	public static void main(String[] args) {
		AxisBank axisObj = new AxisBank();
		axisObj.deposit();
		axisObj.fixed();
		axisObj.saving();
	}

}
