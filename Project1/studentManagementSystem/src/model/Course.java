package model;

public class Course {
	private int crn;
    private static int nextCRN = 1;
	private String name;
	private int creditHours;

	public Course(String name, int creditHours) {
		crn = nextCRN;
		nextCRN++;
		this.name = name;
		setCreditHours(creditHours);
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getCreditHours() {return creditHours;}
	public void setCreditHours(int creditHours) {
		if (creditHours <=0)
			this.creditHours = 3;
		else
			this.creditHours = creditHours;
		}
	public int getCrn() {return crn;}

	@Override
	public String toString() {
		return "This is information of a Course at Universty System:\n"
				+ "CRN=" + crn + " \nname=" + name + " \ncreditHours=" + creditHours;
	}
	
	
}
