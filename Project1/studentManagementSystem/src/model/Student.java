package model;

public class Student {
	private int id;
    private static int nextID = 1;
	private String name;
	private String major;
	private double gpa;
	
	public Student(String name, String major, double gpa) {
		id= nextID;
        nextID++;
		this.name = name;
		this.major = major;
		this.gpa = gpa;
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getMajor() {return major;}
	public void setMajor(String major) {this.major = major;}
	public double getGpa() {return gpa;}
	public void setGpa(double gpa) {this.gpa = gpa;}
	public int getId() {return id;}

	@Override
	public String toString() {
		return 
	"This is information of a Student at Universty System:\n"
	+ "id=" + id + " \nname=" + name + " \nmajor=" + major + " \ngpa=" + gpa;
	}
	
	
}
