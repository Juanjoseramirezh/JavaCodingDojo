package com.codigndojo.phone;

public class IPhone extends Phone implements Ringtable {

	public IPhone(String versionNumber, int batteryPorcentage, String carrier, String ringTone) {
		super(versionNumber, batteryPorcentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ring() {
		// TODO Auto-generated method stub
		return getRingTone();
	}

	@Override
	public String unlock() {
		// TODO Auto-generated method stub
		return "Unlocking via facial recognition";
	}

	@Override
	public void displayInfo() {
		
	System.out.println("iPhone " + getVersionNumber() + " from " + getCarrier() + " Batery: " + getBatteryPorcentage());
	
	}

}
