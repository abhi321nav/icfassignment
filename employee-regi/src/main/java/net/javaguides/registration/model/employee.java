package net.javaguides.registration.model;

public class employee {
	protected int id;
	protected String Name;
	protected String LastName;
	protected String Gender;
	protected String DOB;
	protected String Relationship;
	public employee() {
	}
	
	public employee(String LastName, String Gender, String DOB, String Relationship, int id, String Name) {
		super();
		this.id=id;
	    this.Name = Name;
		this.LastName = LastName;
		this.Gender = Gender;
		this.DOB = DOB;
		this.Relationship = Relationship;
	}

	public employee(int id, String name, String LastName, String Gender ) {
		super();
		this.id = id;
		this.Name = name;
		this.LastName = LastName;
		this.Gender = Gender;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	public String getGender() {
		return Gender ;
	}
	public void setGender(String Gender) {
		this.Gender = Gender;
	}
	public String getDOB() {
		return DOB ;
	}
	public void setDOB(String DOB) {
		this.DOB = DOB;
	}
	public String getRelationship() {
		return Relationship ;
	}
	public void setRelationship( String Relationship) {
		this.Relationship = Relationship;
	}
	
}



