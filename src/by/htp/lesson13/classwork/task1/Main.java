package by.htp.lesson13.classwork.task1;


import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<Student> list = new LinkedList<Student>();
		Student st1= new Student("Ivan", new GregorianCalendar(1989,01,01));
		Student st2= new Student("Petr", new GregorianCalendar(2000,11,01));
		Student st3= new Student("Ivan", new GregorianCalendar(1995,12,10));
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		for(Student e: list){
		System.out.println(e.toString());
		}
		list.remove(1);
		System.out.println("After delete");
		for(Student e: list){
			System.out.println(e.toString());
			}

	}

}
