package bank;

public class AxisBank extends BankInfo {
	public void deposit()
	{
		System.out.println(" DISPLAY CURRENT DEPOSIT ");
	}

	public static void main(String[] args) {
		
		BankInfo bi = new BankInfo();
		bi.savings();
		bi.fixed();
		bi.deposit();
		AxisBank ab = new AxisBank();
        ab.deposit();
	}

}
