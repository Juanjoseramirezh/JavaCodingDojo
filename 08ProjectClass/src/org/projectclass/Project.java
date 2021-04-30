package org.projectclass;

public class Project {
	private String name;
	private String description;

	// METODO DE OBJETO
	public String elevatorPitch(String name, String description) {
		return createElevatorPitch(name + " : " + description);
	}

	private String createElevatorPitch(String makeTheElevatorPitch) {
		return makeTheElevatorPitch;
	}

	// METODOS DE CLASES
	public Project() {

	}

	public Project(String name) {
		this.name = name;
	}

	public Project(String name, String description) {
		this.name = name;
		this.description = description;
	}

	// GETTER Y SETTER
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
