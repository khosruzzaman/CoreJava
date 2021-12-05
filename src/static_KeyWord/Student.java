package static_KeyWord;

//V_89_Static_ 90, 

public class Student {

	String name;
	int id;
	static String universityName = "Leading University";
	String quot = "What the Fuck !!";
	static String quots = "What the Fuck !!";

	Student(String n, int i) {
		name = n;
		id = i;
	}

	void displayInformation() {
		System.out.println("Student ID : " + id);
		System.out.println("Student Name : " + name);
		
		System.out.println("Name of University is : " + universityName);
	}

}
