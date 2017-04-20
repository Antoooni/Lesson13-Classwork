package by.htp.lesson13.classwork.task2to4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainHash {

	public static void main(String[] args) {
		Set<Student> setStudent = new HashSet<>();
		Student st1 = new Student("Ivan", "Ivanovich", "Ivanov");
		Student st2 = new Student("Petr", "Petrovich", "Petrov");
		Student st3 = new Student("Ivan", "Ivanovich", "Petrov");
		Student st4 = new Student("Anton", "Yur'evich", "Mazets");
		Student st5 = new Student("Maxim", "Maximovich", "Maximov");
		Student st6 = new Student("Maxim", "Maximovich", "Maximov");
		Student st7 = new Student("Maxim", "Maximovich", "Maximov");
		Student st8 = new Student("Kirill", "Evgen'evich", "Kirillov");
		Student st9 = new Student("Vasiliy", "Vasil'evich", "Vasiliev");
		Student st10 = new Student("Semen", "Semenovich", "Gorbunkov");
		Student st11 = new Student("Kirk", "Ivan", "Ivan");
		setStudent.add(st1);
		setStudent.add(st2);
		setStudent.add(st3);
		setStudent.add(st4);
		setStudent.add(st5);
		setStudent.add(st6);
		setStudent.add(st7);
		setStudent.add(st8);
		setStudent.add(st9);
		setStudent.add(st10);
		setStudent.add(st11);

		// MainHashService hashService=new MainHashServiceImp(setStudent);
		// hashService.printAllStudents(setStudent);

		System.out.println("All students: ");
		for (Student e : setStudent) {
			e.printAllStudents();
		}
		List<Student> sortedList = new ArrayList<Student>(setStudent);
		Collections.sort(sortedList, new FirstNameComparator());
		System.out.println('\n' + "Sorted by name all students: ");
		for (Student e : sortedList) {
			e.printAllStudents();
		}

		Collections.sort(sortedList, new SurNameComparator());
		System.out.println('\n' + "Sorted by surname all students: ");
		for (Student e : sortedList) {
			e.printAllStudents();
		}

		Collections.sort(sortedList, new MiddleNameComparator());
		System.out.println('\n' + "Sorted by middle name all students: ");
		for (Student e : sortedList) {
			e.printAllStudents();
		}

		System.out.println('\n' + "All students, which names begin from Vowels: ");
		for (Student e : setStudent) {
			e.printVowels();
		}

		Set<Student> hashSetToTreeSet = new TreeSet<Student>(new FirstNameComparator());
		hashSetToTreeSet.addAll(setStudent);
		hashSetToTreeSet.size();
		Iterator<Student> it1 = hashSetToTreeSet.iterator();
		int i = 0;
		System.out.println("Every even student: ");
		while (it1.hasNext()) {
			if (i == 0 || i % 2 == 0) {
				System.out.println(it1.next().getfirstName());
			} else {
				it1.remove();
			}
			i++;
		}

	}

}
