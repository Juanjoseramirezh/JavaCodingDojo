package com.codigndojo.phone;

public class Galaxy extends Phone implements Ringtable{

	public Galaxy(String versionNumber, int batteryPorcentage, String carrier, String ringTone) {
		super(versionNumber, batteryPorcentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ring() {
		
		return "Galaxy " + getVersionNumber() + " say "+ getRingTone();
	}

	@Override
	public String unlock() {
		
		return "Unlocking via finger print";
	}

	@Override
	public void displayInfo() {
		System.out.println("Galaxy " + getVersionNumber() + " from " + getCarrier() + " Batery: " + getBatteryPorcentage());
		
		
	}

}
