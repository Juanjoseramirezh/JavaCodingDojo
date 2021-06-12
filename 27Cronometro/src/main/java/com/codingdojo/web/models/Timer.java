package com.codingdojo.web.models;

import java.util.Date;

public class Timer {
	private Date star;
	private Date stop;
	private long diferencia;
	
	public Timer() {
		
	}

	public Timer(Date star, Date stop) {
		super();
		this.star = star;
		this.stop = stop;
		this.diferencia = getDiferencia(this.stop, this.star);
	}

	// GETTER AND SETTER
	public Date getStar() {
		return star;
	}

	public void setStar(Date star) {
		this.star = star;
	}

	public Date getStop() {
		return stop;
	}

	public void setStop(Date stop) {
		this.stop = stop;
	}

	public long getDiferencia() {
		return diferencia;
	}

	public void setDiferencia(long diferencia) {
		this.diferencia = diferencia;
	}

	// MODELAMIENTO REGLA
	public static long getDiferencia(Date endDate, Date starDate) {
		return endDate.getTime() - starDate.getTime();
	}

}
