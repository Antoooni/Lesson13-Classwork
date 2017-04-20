package by.htp.lesson13.classwork.task2to4;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Student> {
	@Override
    public int compare(Student o1, Student o2) {
        return o1.getfirstName().compareTo(o2.getfirstName());
    }
}
