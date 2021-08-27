package org.system;

public class Desktop extends Computer{
	public void desktopSize()
	{
		String size = " 4gb RAM";
		System.out.println(" the size of desktop = "+size);
	}

	public static void main(String[] args) {
	Computer compu = new Computer()	;
	compu.computerModel();
	System.out.println(" END COMPUTER");
	Desktop desk = new Desktop();
	desk.desktopSize();
	System.out.println("END DESKTOP");
			}

}
