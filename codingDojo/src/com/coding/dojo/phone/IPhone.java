package com.coding.dojo.phone;

public class IPhone extends Phone implements Ringable{

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayInfo() {
		System.out.println("Version number:"+super.getVersionNumber());
    	System.out.println("Battery:"+super.getBatteryPercentage());
		System.out.println("Carrier:"+super.getCarrier());
	}

	@Override
	public String ring() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String unlock() {
		// TODO Auto-generated method stub
		return null;
	}

}