package system;
import java.util.ArrayList;
import java.util.Scanner;

import model.Student;
import model.Course;
import model.Enrollment;

public class UniversitySystem {
	private ArrayList<Student> students = new ArrayList<>();
	private ArrayList<Course> courses = new ArrayList<>();
	private ArrayList<Enrollment> enrollments = new ArrayList<>();


	public Student findStudentById(int id) {
		for (Student student : students) {
			if (id == student.getId()) {
				return student;
			}
		}
		return null;
	}
	
	public boolean addStudent(Student new_student) {
		if(new_student == null) {
			System.out.println("invalid input.");
			return false;
		}
		if(new_student.getGpa()>4 || new_student.getGpa()<0
		|| new_student.getName()== null || new_student.getName().trim().isEmpty() 
		|| new_student.getMajor()== null || new_student.getMajor().trim().isEmpty()) {
			System.out.println("messing input.");
			return false;
		}
		students.add(new_student);
		return true;
	}
	public boolean removeStudent(int id) {
		Student student = findStudentById(id);
		if (student!= null) {
			students.remove(student);
			System.out.println("The student has been removed.");
			return true;
		}
		return false;
	}	
	public boolean updateStudent(int id,Scanner input) {
		boolean done=false;
		Student student = findStudentById(id);
		if (student!= null) {
			boolean countinue = true;
			while(countinue) {
				System.out.println("What do you want to update:");
				System.out.println("1-Name");
				System.out.println("2-Major");
				System.out.println("3-GPA");
				int choice=input.nextInt();
				
				switch (choice) {
					case 1: {
						System.out.println("What is the updated name?");
						String update=input.nextLine();
						student.setName(update);
						break;
					}	
					case 2: {
						System.out.println("What is the updated Major?");
						String update=input.next();
						student.setMajor(update);
						break;
					}
					case 3: {
						System.out.println("What is the updated GPA?");
						double update=input.nextDouble();
						student.setGpa(update);
						break;
					}
					default:
						System.out.println("invaild input.");
				}
				System.out.println("Do you want to update anything else? (y,n)");
				String co =input.next();
				if (co.equalsIgnoreCase("n"))
					countinue=false;
			}
			done=true;
		}
		return done;
	}
	
}