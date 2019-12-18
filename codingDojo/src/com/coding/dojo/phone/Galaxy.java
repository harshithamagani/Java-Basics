package com.coding.dojo.phone;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
		return "Galaxy Galaxy Ring Ring Ring";
    }
    @Override
    public String unlock() {
		return "touch";
    }
    @Override
    public void displayInfo() {
    	System.out.println("Version number:"+super.getVersionNumber());
    	System.out.println("Version number:"+super.getBatteryPercentage());
    	
    }
}
