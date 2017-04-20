package by.htp.lesson13.classwork.task2to4;

import java.util.HashSet;

public class MainHashServiceImp implements MainHashService {
	public Student student;

	//@Override
//	public void printAllStudents() {
//		// TODO Auto-generated method stub
//		
//	}

	public MainHashServiceImp(HashSet<Student> setStudent) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printAllStudents(HashSet<Student> setStudent) {
		System.out.println("Student "+student.getfirstName()+student.getMiddleName()+student.getSurName());
		
		
	}
}
