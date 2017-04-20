package by.htp.lesson13.classwork.task1;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Student {
	private String name;
	private GregorianCalendar dateOfBirth;

	public Student() {
		super();
	}

	public Student(String name, GregorianCalendar dateOfBirth) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public GregorianCalendar getAge() {
		return dateOfBirth;
	}
	
	public void setAge(GregorianCalendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		SimpleDateFormat date = new SimpleDateFormat("dd.MM.YYYY");
		return "Student "+name+", Date of birth: "  +date.format(dateOfBirth.getTime());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	

	

}
