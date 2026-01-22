package app;

import java.util.Scanner;

import model.Course;
import model.Enrollment;
import model.Student;
import system.UniversitySystem;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		UniversitySystem universitySystem = new UniversitySystem();

		while(true) {
			System.out.println("Welcom to The Universtiy System");
			System.out.println("What service do you need?");
			System.out.println("1-add new student");
			System.out.println("2-update student deatils");
			System.out.println("3-find a student");
			System.out.println("4-reamove a student");
			System.out.println("5-Exit");
			int choise=input.nextInt();
			input.nextLine();
			switch (choise) {
			case 1: {
				System.out.println("what is his/her name?");
				String name=input.nextLine();
				System.out.println("what is his/her major?");
				String major=input.nextLine();
				System.out.println("what is his/her GPA?");
				double gpa=input.nextDouble();
				input.nextLine();
				Student s = new Student(name,major,gpa);
				universitySystem.addStudent(s);
				break;
			}
			case 2: {
				System.out.println("what is the student id?");
				int id=input.nextInt();
				input.nextLine();
				universitySystem.updateStudent(id,input);
				break;
			}
			case 3: {
				System.out.println("what is the student id?");
				int id=input.nextInt();
				input.nextLine();
				Student student=universitySystem.findStudentById(id);
				if (student==null) {
					System.out.println("There is no student.");
				}
				else {
				System.out.println(student);}
				break;
			}
			case 4: {
				System.out.println("what is the student id?");
				int id=input.nextInt();
				input.nextLine();
				universitySystem.removeStudent(id);
				break;
			}
			case 5:{
				return;
			}
			default:
				
			}
		}
	}
}
