package by.htp.lesson13.classwork.task2to4;

import java.util.Comparator;

public class SurNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getSurName().compareTo(o2.getSurName());
	}

}
