package by.htp.lesson13.classwork.task2to4;


public class Student  {
	private String firstName;
	private String middleName;
	private String surName;

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String name) {
		this.firstName = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public Student() {
		super();
	}

	public Student(String firstName,  String middleName, String surName) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.surName = surName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((surName == null) ? 0 : surName.hashCode());
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
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		if (surName == null) {
			if (other.surName != null)
				return false;
		} else if (!surName.equals(other.surName))
			return false;
		return true;
	}

	public static boolean findVowel(String firstName) {
		boolean b = false;
		final char[] cs = { 'a', 'A', 'e', 'E', 'u', 'U', 'i', 'I', 'o', 'O' };
		for (char e : cs) {
			if (firstName.charAt(0) == e) {
				b = true;
				break;
			}
		}

		return b;
	}

	public void printAllStudents() {
		System.out.println("Student: " + getfirstName() + " " + getMiddleName() + " " + getSurName());
	}

	public void printVowels() {
		if (findVowel(getfirstName()) == true) {
			printAllStudents();
		}

	}
	

	

}
