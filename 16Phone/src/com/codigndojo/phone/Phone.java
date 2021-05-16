package com.codigndojo.phone;

public abstract class Phone {

	// MEMBER VARIABLES
	private String versionNumber;
	private int batteryPorcentage;
	private String carrier;
	private String ringTone;

	// CONSTRUCTOR
	public Phone(String versionNumber, int batteryPorcentage, String carrier, String ringTone) {
		// super();
		this.versionNumber = versionNumber;
		this.batteryPorcentage = batteryPorcentage;
		this.carrier = carrier;
		this.ringTone = ringTone;
	}

	// METODO ABSTRACTO. SERA IMPLEMENTADO PARA LAS SUBCLASES
	public abstract void displayInfo();

	// GETTER AND SETTER
	public String getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

	public int getBatteryPorcentage() {
		return batteryPorcentage;
	}

	public void setBatteryPorcentage(int batteryPorcentage) {
		this.batteryPorcentage = batteryPorcentage;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getRingTone() {
		return ringTone;
	}

	public void setRingTone(String ringTone) {
		this.ringTone = ringTone;
	}

}
