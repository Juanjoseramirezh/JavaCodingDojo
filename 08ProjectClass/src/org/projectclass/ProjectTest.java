package org.projectclass;

public class ProjectTest {

	public static void main(String[] args) {
		Project p = new Project();
		Project onlyName = new Project("name2");
		Project nameAndDescription = new Project("name3", "description3");
		
		String name1 = p.elevatorPitch("name1", "description1");
		String name2 = onlyName.getName();
		String name3 = nameAndDescription.elevatorPitch("name3", "description3");
		
		
		//PRINT ACÁ
		System.out.println("el primer nombre con descripcion (elevatorPitch) " + name1);
		System.out.println("el segundo nombre " + name2);
		System.out.println("el tercer nombre con descripcion " + name3);
		
		
	}

}
