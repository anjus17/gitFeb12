package org.com;

public class Desktop implements HardWare,Software {

	
	private void desktopModel() {
System.out.println("Desktop model is HP");
	}

	@Override
	public void softwareResources(int a) {
System.out.println("Windows Operating System" + a);		
	}

	@Override
	public void hardwareResources(int b) {
		System.out.println("HP System" + b);		
		
	}
	
	
	public static void main(String[] args) {
		
		Desktop d = new Desktop();
		d.desktopModel();
		d.softwareResources(12);
		d.hardwareResources(13);
	}
}
